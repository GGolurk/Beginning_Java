# Beginning_Java
First Java programming. 


Algorithm writing (for guessing numbers):

    main:
        initialize class instance

    Constructor:
        playing = true
        Boolean correctInput = false
        while playing
            userInput = menu()
            if userInput == 0
                playing = false
                correctInput = true
            if userInput == 1
                correctInput = true
                humanGuesser()
            if userInput == 2
                computerGuesser()
                correctInput = true
            if correctInput == false
                "Sorry, I didn't get that. Please retry, or hit '0' to quit."

    Menu:
        scanner input = new Scanner
        println ("Enter 0 to quit, 1 for human guesser, or 2 for computer guesser")
        string userInput = input.nextLine()
        return userInput

    Data members:
        bool playing

    humanGuesser:
        double targetDouble = computer generates random number between 0 and 1
        targetDouble *= 100
        int targetNum = (int) targetDouble
        Integer guesses = 0
        println "I'm thinking of a number. Guess, and I'll tell you if it was too high, too low, or correct."
        println "It is always possible to do this in seven tries. Do your best!"
        while guessing
            Scanner input = new Scanner(System.in)
            String userInput = input.nextLine
            try{
                Integer userNum = Integer.parseInt(userInput)
                if (101 > userInput) {
                    if(userInput > 0){
                        //Do stuff
                    }
                } else {
                    println "Please enter a number between 1 and 100."
                }
            } except {
                println "Please enter a number."
            }
            guesses++
        if guesses < 7
            you did good
        else if guesses == 7
            you did ok
        else
            you did bad
    

    computerGuesser:
        Integer guesses = 0
        Integer lowEnd = 0
        Integer highEnd = 100
        Integer guess = 50
        while guessing
            guesses += 1;
            print guess
            get user input
            optional: validate user input
            if user input == low
                highEnd = guess
                guess = lowEnd + (highEnd - lowEnd) / 2
            if user input == high
                lowEnd = guess
                guess = lowEnd + (highEnd - lowEnd) / 2
            if user input == correct
                guessing = false
            if guesses >= 6
                guessing = false
                print "your number is " + guess


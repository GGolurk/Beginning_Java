# Beginning_Java
First Java programming. 


Algorithm writing (for guessing numbers):

    main:
        initialize class instance

    Constructor:
        playing = true
        while playing
            userInput = menu()
            if userInput == 0
                playing = false
            if userInput == 1
                humanGuesser()
            if userInput == 2
                computerGuesser()
            else
                "Sorry, I didn't get that. Please retry, or hit '0' to quit."

    Data members:
        bool playing

    humanGuesser:
        targetNum = computer generates random number between 1 and 100
        num guesses = 0
        while guessing
            human guesses number
            computer tells result (high, low, correct)
            guesses++
        if guesses < 7
            you did good
        else if guesses == 7
            you did ok
        else
            you did bad
    

    computerGuesser:
        int lowEnd = 0
        int highEnd = 100
        int guess = 50
        while guessing
            get user input
            optional: validate user input
            if user input == low
                highEnd = guess
                guess = lowEnd + (highEnd - lowEnd) / 2
                print guess
            if user input == high
                lowEnd = guess
                guess = lowEnd + (highEnd - lowEnd) / 2
                print guess
            if user input == correct
                guessing = false


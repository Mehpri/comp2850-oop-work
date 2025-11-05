fun main() {
    var attempt = 1
    println("Enter the name of the file that contains the words you want to use!")
    val filename = readln()
    val words = readWordList(filename)
    val target = pickRandomWord(words)

    var guess = ""
    while (guess != target && attempt <= 10){
        guess = obtainGuess(attempt)
        val matches = evaluateGuess(guess,target)
        displayGuess(guess,matches)
        attempt += 1
    }
    if (guess == target){
        println("Congratulation you guessed the word $target and completed it in $attempt attempts")
    }
    else{
        println("You ran out of attempts! The word was $target thanks for playing try again!")
    }
}

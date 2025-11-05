fun main() {
    var attempt = 0
    println("Enter the name of the file that contains the words you want to use!")
    val filename = readln()
    readWordList(filename)
    pickRandomWord(words)
    while (guess != target && attempt != 11){
        attempt += 1
        obtainGuess(attempt)
        evaluateGuess(guess,target)
        displayGuess(guess,matches)
    }
    if (guess == target){
        println("congratulation you guessed the word $target and completed it in $attempt number of attempts")
    }
    else{
        println("You ran out of attempts! The word was $target thanks for playing try again!")
    }
}

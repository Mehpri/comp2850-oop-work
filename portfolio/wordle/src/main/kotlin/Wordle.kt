// Implement the six required functions here
//1
fun isValid(word: String): Boolean{
    if (word.length == 5) {
        return true
    }
    else{
        println("Your word is not valid in Wordle")
        return false
    }
}

//2
fun readWordList(filename: String): MutableList<String>{
    val words = mutableListOf<String>()              
    words.addAll(File(filename).readLines())         
    return words
}

//3
fun pickRandomWord(words: MutableList<String>): String{
    val target = words.random()
    words.remove(target)
    return target
}

//4
fun obtainGuess(attempt: Int): String{
    println("Please enter attempt number $attempt")
    var guess = readln()
    while (isValid(guess) == false){
        println("Please enter in a valid guess")
        guess = readln()
    }
    return guess
}

fun evaluateGuess(guess: String, target: String): List<Int>{
    var matches = mutableListOf<Int>()
    for (i in 0 until 5){
        if (guess[i] == target[i]){
            matches.add(1)
        }
        else{
            matches.add(0)
        }
    }
    return matches
}

//6
fun displayGuess(guess: String, matches: List<Int>){
    for (i in 0 until 5){
        if (matches[i] == 1){
            println(guess[i])
        }
        else{
            println("?")
        }
    }
}
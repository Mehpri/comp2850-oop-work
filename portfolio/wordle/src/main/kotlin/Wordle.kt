// Implement the six required functions here
fun isValid(word: String): Boolean{
    if (word.length == 5) {
        return true
    }
    else{
        println("Your word is not valid in Wordle")
    }
}

fun readWordList(filename: String): MutableList<String>{
    val words = mutableListOf<String>()              
    words.addAll(File(filename).readLines())         
    return words
}

fun pickRandomWord(words: MutableList<String>): String{
    
}
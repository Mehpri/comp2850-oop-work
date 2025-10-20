// Task 5.1.1: anagram checking using a function
infix fun String.anagramOf(second: String): Boolean {
    if (this.length != second.length) {
        return false
    }
    val thisChars = this.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return thisChars == secondChars
}

fun main(){
    println("Enter two anagrams which will be compared to see if they're the same:")
    val first = readln()
    val second = readln()
    if (second anagramOf first) {
        println("$first and $second are anagrams!")
    }
}
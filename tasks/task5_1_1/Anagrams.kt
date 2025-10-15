// Task 5.1.1: anagram checking using a function
fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main(){
    println("Enter two anagrams which will be compared to see if they're the same:")
    val first = readln()
    val second = readln()
    println(anagrams(first,second))
}
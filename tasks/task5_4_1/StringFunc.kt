// Task 5.4.1: string extension function
fun String.tooLong() = this.length > 20 

fun main(){
    val n = "stackofthenightwasgreatandfun"
    if(n.tooLong()){
        print("$n is too long")
    }
    else{
        print("$n is a good length")
    }
}
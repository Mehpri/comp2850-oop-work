// Task 5.4.1: string extension function
val String.tooLong: Boolean get() = this.length > 20 

fun main(){
    val n = "stackofthenightwasgreatandfun"
    if(n.tooLong){
        print("$n is too long")
    }
    else{
        print("$n is a good length")
    }
}
// Task 4.5: summing odd integers with a for loop
fun main(){
    print("Enter an upper limit for a summation of all odd numbers up to inputted number:")
    val upper = readln().toInt()
    var sum = 0
    for (i in 1..upper step 2){
        sum += i
        
    
    }
    println(sum)
}
import kotlin.system.exitProcess
import kotlin.math.roundToInt
fun main(args: Array<String>){
    if (args.size==3){
        val num1 = args[0].toInt()
        val num2 = args[1].toInt()
        val num3 = args[2].toInt()

        val average = ((num1+num2+num3)/3.0).roundToInt()
        val grade = when(average) {
            in 0..39 -> "Fail"
            in 40..69 -> "Pass"
            else -> "Distinction"
            
        
        }
        println("Your grade is $grade and your average was $average")
    }
    else{
        println("Error: program requires 3 arguments ")
        exitProcess(1)
    }
    

}
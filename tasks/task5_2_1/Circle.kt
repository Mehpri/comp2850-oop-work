// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius
fun circumference(radius: Double) = PI * radius *2
fun readDouble(prompt: String): Double{
    print(prompt)
    val input = readln()
    return input.toDouble()
}

fun main(){
    val radius = readDouble("Enter the radius of your circle:")
    print("Area: %.2f\n".format(circleArea(radius)))
    print("Circumference: %.2f\n".format(circumference(radius)))
}
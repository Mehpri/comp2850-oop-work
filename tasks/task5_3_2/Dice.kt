// Task 5.3.2: dice rolling simulation
import kotlin.random.Random

fun rollDice(sides: String, diceNumber: String, defaultDice: Int = 1, defaultSides: Int = 6){
    val sidesInt = sides.toIntOrNull() ?: defaultSides
    val diceNumberInt = diceNumber.toIntOrNull() ?: defaultDice
    if (sidesInt in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling $diceNumberInt dice with d$sidesInt...")
        var result = 0
    for (i in 1..diceNumberInt){
        val roll =  Random.nextInt(1, sidesInt + 1)
        println("You rolled $roll")
        result += roll
    }
        println("Total of all dice: $result")
    }
    else{
        println("Error: cannot have a $sides-sided die")
    }
}

fun main(){
    print("Enter number of sides of the dice being rolled and the amount of dice you want to roll")
    var sides = readln()
    var diceNumber = readln()
    rollDice(sides,diceNumber)
}
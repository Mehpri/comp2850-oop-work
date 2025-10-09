fun main(){
    println("""
    PIZZA MENU
    (a) Margherita
    (b) Quattro Stagioni
    (c) Seafood
    (d) Hawaiian

    Choose your pizza (a-d):""")

    val order = readln().lowercase()

    if (order.length == 1){
        if (order[0] in 'a'..'d'){
            println("Order Accepted")
    }
        else{
            println("Invalid choice!")
    }
}
    else{
        println("Invalid input")
}
}

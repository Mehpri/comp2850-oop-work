fun main(){
    println("""
    PIZZA MENU
    (a) Margherita
    (b) Quattro Stagioni
    (c) Seafood
    (d) Hawaiian

    Choose your pizza (a-d):""")

    var order = readln().lowercase()

   
    while (order[0] !in 'a'..'d' || order.length != 1){
        println("Invalid choice!")
        print("Choose your pizza (a-d):")
        order = readln().lowercase()
        }

    println("Order Accepted")
    

}

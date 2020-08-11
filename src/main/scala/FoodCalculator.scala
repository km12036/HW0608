object FoodCalculator extends App {

    val food = "potatoes"
    val price = 0.37
    val quantity = 20
    val total=price*quantity

    println(s"It will cost $total EUR to buy $quantity kilos of $food.")

    val cost=args(0).toFloat*args(1).toInt
    println(s"The first argument is ${args(0)}")
    println(s"The second argument is ${args(1)}")
    println(s"The third argument is ${args(2)}")

    println(s"It will cost $cost EUR to buy ${args(1)} kilos of ${args(2)}.")


}

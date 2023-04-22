package functions

//  using a function parameter
fun sumOfNumbers(
    num1: Int,
    num2: Int,
    sum: (sum: Int) -> Unit
) {
    //  pass the result back to the sum function
    sum(num1 + num2)
}

//  using a return statement
fun sumOfNumbersAlt(
    num1: Int,
    num2: Int
): Int {
    return num1 + num2
}

fun main() {

    val a = 10
    val b = 20
    val sum = sumOfNumbersAlt(a, b)

    println("Sum using return value = $sum")

    //  sum using the function parameter
    sumOfNumbers(
        num1 = a,
        num2 = b,
        sum = {
            //  here, we get our sum value and manipulate it
            println("Sum is $it")
        }
    )
}








































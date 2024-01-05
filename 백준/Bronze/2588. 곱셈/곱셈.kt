import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val num1 = nextInt()
    val num2 = nextInt()

    val a = num1 * (num2%10)
    val b = num1*((num2%100)/10)
    val c = num1*(num2/100)

    println(a)
    println(b)
    println(c)
    println(a+(b*10)+(c*100))
}

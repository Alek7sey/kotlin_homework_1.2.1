import java.lang.Integer.max
import kotlin.math.roundToInt

fun main() {
    val comission = 0.0075
    val minComission = 35
    val transfer1 = 1010
    val transfer2 = 10100

    val amount1 = max((transfer1 * comission).roundToInt(), minComission)
    val amount2 = max((transfer2 * comission).roundToInt(), minComission)
    println("Перевод на сумму $transfer1 руб. Размер комиссии составит $amount1 руб.")
    println("Перевод на сумму $transfer2 руб. Размер комиссии составит $amount2 руб.")
}
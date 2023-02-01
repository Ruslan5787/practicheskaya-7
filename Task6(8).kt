import kotlin.math.abs
import kotlin.math.log
import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    println("Введите через Enter, пять  числовых значения, которые больше нуля");
    val a: Int = readln().toInt();
    val b: Double = readln().toDouble();
    val c: Int = readln().toInt();
    val d: Int = readln().toInt();
    val n: Double = readln().toDouble();

    if (a > 0 && b > 0 && c > 0 && d > 0 && n > 0) {
        val numerator: Double = 0.25 * (a - b);

        val thirdFraction: Double = log(10.0, b) / c - d;
        val secondFraction: Double = (abs(b) / 10.0.pow(n + 3) + thirdFraction)

        val denominator: Double = 1.0 / 8.0 - secondFraction;

        var result: Double = numerator / denominator;

        result = (result * 1000).roundToInt() / 1000.0

        println(result);
    } else {
        println("Введите правильные значения");
    }
}

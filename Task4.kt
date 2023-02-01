import kotlin.math.roundToInt

fun main() {
    val degrees: Int = 451;
    var result: Double = 5.0 / 9.0 * (degrees - 32);

    result = (result * 1000).roundToInt() / 1000.0;

    println("451 градус Фаренгейт = $result градус Цельсия");
}

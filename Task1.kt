fun main() {
    println("Введите первый и пятый член арифметической прогресии");
    val firstNumber: Int = readln().toInt();
    val fifthNumber: Int = readln().toInt();

    println("Введите номер числа из прогрессии");
    val n: Int = readln().toInt();

    val difference: Double = (fifthNumber - firstNumber) % 4.0;

    val progressionMember: Double = firstNumber + (n - 1) * difference;

    val sum: Double = ((fifthNumber + progressionMember) * n) % 2.0;

    println("$n-ый член прогрессии: $progressionMember");
    println("Сумма первых $n членов прогресии: $sum");
}

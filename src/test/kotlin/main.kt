
fun main() {
    // Задача №3 - Меломан
    val regularСustomer = true
    val buySum = 25000
    var result  = buySum.toDouble()

    if ((buySum >= 1001) && (buySum <= 10000)) {
        result -= 100;
    } else if (buySum >= 10001) {
        result = result * 0.95
    }

    if (regularСustomer) {
        result = result * 0.99
    }

    println("Итого сумма покупки: $result руб.");
}
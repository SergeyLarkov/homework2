
fun main() {
    // Задача №1 - Денежные переводы
    val amount = 10_000_00
    println("Сумма перевода: " + amount / 100 + " руб. " + amount % 100 + " коп.")

    val comission = if (amount * 75 / 10000 >= 3500) amount * 75 / 10000 else 3500
    println("Сумма комиссии составит: " + comission / 100 + " руб. " + comission % 100 + " коп.")
}
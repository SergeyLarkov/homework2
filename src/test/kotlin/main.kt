
fun main() {
    // Задача №2 - Люди/Человеки
    val likes = 109
    val txt = if ((likes % 10 == 1)  && (likes != 11) && (likes % 100 != 11)) "человеку" else "людям"
    println("Понравилось $likes " + txt)
}
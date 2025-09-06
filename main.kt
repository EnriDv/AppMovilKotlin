enum class Genero {
    Hombre,
    Mujer
}

fun main() {
    println("Hola Mundo!")
    val nombre = "Enrique Diaz"
    println("Mi nombre es: $nombre")
    val materia = "Aplicaciones Moviles"
    println("La materia es: $materia")
    val peso : Int = 80
    val altura : Double = 1.72
    var edad : Int = 23
    println("Yo peso: $peso kg")
    println("Y mido: $altura metros")
    println("Tengo $edad años")
    var es_par : Boolean = (edad % 2 == 0)
    if (es_par) { println("Mi edad es par.") }
    else { println("Mi edad es impar.") }
    val genero = Genero.Hombre
    println("Yo soy $genero")
}
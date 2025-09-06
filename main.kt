enum class Genero {
    Hombre,
    Mujer
}

fun saludo(saludo: String = "Hola", nombre: String)
{
    println("$saludo $nombre")
}

fun genero(genero: Genero) : String
{
    return "Mi genero es: $genero"
}

fun main() {
    val nombre = "Enrique Diaz"
    saludo("Hola a todos, yo soy:", nombre) //Hola a todos, yo soy: Enrique Diaz
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
    println(genero(genero)); //Mi genero es: Hombre
}
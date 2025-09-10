enum class Genero {
    Hombre,
    Mujer
}

data class Persona(
    val nombre: String,
    val peso: Int,
    val altura: Double,
    var edad: Int,
    val genero: Genero
) {
    fun saludo(saludo: String = "Hola") {
        println("$saludo $nombre")
    }

    fun mostrarMateria(materia: String) {
        println("La materia es: $materia")
    }

    fun mostrarDatos() {
        println("Yo peso: $peso kg")
        println("Y mido: $altura metros")
        println("Tengo $edad años")
        if (edad % 2 == 0) println("Mi edad es par.")
        else println("Mi edad es impar.")
    }

    fun miGenero(): String {
        return "Mi genero es: $genero"
    }

    fun esMayorEdad(): Boolean = edad >= 18
}
fun main() {
    val persona = Persona("Enrique Diaz", 80, 1.72, 23, Genero.Hombre)

    persona.saludo("Hola a todos, yo soy:")
    persona.mostrarMateria("Aplicaciones Moviles")
    persona.mostrarDatos()
    println(persona.miGenero())
    println("¿Es mayor de edad?: ${persona.esMayorEdad()}")

}
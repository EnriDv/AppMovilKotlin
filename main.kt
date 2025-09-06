enum class Genero {
    Hombre,
    Mujer
}

enum class Gender( 
    val descripcion : String,
    val x : String,
) {
    Male("Masculino", "M"),
    Female("Femenino", "F"),
}

fun mostrarGenero()
{
    println(Gender.Male)
    println(Gender.Male.descripcion)
    println(Gender.Male.x)
    
    println(Gender.Female)
    println(Gender.Female.descripcion)
    println(Gender.Female.x)

    var data: Any
    data = "Aplication"
    println(data)
    data = 2025
    println(data)
    if (data is String)
    {
        println(data.length)
    }
}

fun saludo(saludo: String = "Hola", nombre: String)
{
    println("$saludo $nombre")
}


fun genero(genero: Genero) : String
{
    return "Mi genero es: $genero"
}

//funcion de extensiones

fun Int.esPar() : Boolean = this % 2 == 0
fun String.invertir() : String = this.reversed()

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
    mostrarGenero()
    println(10.esPar())
    println("Kotlin".invertir())
    // lambdas
    val sumar: (Int, Int) -> Int = {a,b -> a+b}
    println(sumar(1,2))
    val sumarv2 = {a: Int, b:Int -> a + b}
    println(sumarv2(2, 5))
    // listas
    var frutas: List<String> = listOf("manzana","uva","sandia")
    println(frutas)
    // frutas.add("pera")  error
    
    var numbers: List<Int> = listOf(1, 2, 3, 4)
    println(numbers)

    var frutas2: MutableList<String> = mutableListOf("manzana","uva","sandia")
    println(frutas2)
    frutas2.add("pera")
    println(frutas2)
    frutas2.remove("uva")
    frutas2.removeAt(0)
    println(frutas2)
    
    // set
    
    var set1: Set<Int> = setOf(1,2,3)
    println(set1)
    
    /*
    var set2: MutableSet<Int>= mutableSetOf(1,2,3,4,5)
    println(set2)
    set2.add(32)
    println(set2)
	*/    

    // map
    
    val notasFinales : Map<String, Int> = mapOf(
    	"Enrique" to 100,
    	"Rafa" to 98,
    	)
    println(notasFinales)
    
    val notasFinales2 : MutableMap<String, Int> = mutableMapOf()
    notasFinales2["Matias"] = 20
    notasFinales2["Cristopher"] = 0
    println(notasFinales2)
    
    println(notasFinales2["Matias"])
    println(notasFinales2.getOrDefault("Rafa", 0))
    
    val rafa = Estudiante("Enrique", 23)
    println(rafa.nombre)
    println(rafa.edad)
    rafa.saludo()
    println(rafa.esMayorEdad())
} 

data class Estudiante(val nombre: String, val edad: Int,){
    fun saludo(){
        println("Hola, soy ${this.nombre}")
        println("tengo $edad años")
    }
    fun esMayorEdad() : Boolean = edad > 17
}

sealed interface Forma
class circulo( val radio: Double): Forma
class rectangulo( val ancho: Double, val alto: Double): Forma


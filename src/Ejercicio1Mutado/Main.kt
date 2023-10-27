package Ejercicio1Mutado

fun main() {
    val mercurio = Planeta("Mercurio", "Rocoso", 3.3011E23)
    val venus = Planeta("Venus", "Rocoso", 4.8675E24)
    val tierra = Planeta("Tierra", "Habitable", 5.972E24)
    val marte = Planeta("Marte", "Rocoso", 6.39E23)
    val jupiter = Planeta("Jupiter", "Gaseoso", 1.898E27)
    val saturno = Planeta("Saturno", "Gaseoso", 5.683E26)
    val urano = Planeta("Urano", "Gaseoso", 8.681E25)
    val neptuno = Planeta("Neptuno", "Gaseoso", 1.024E26)
    val planetas = listOf(mercurio, venus, tierra, marte, jupiter, saturno, urano, neptuno)
    println("El planeta con mayor masa es: ${mercurio.planetaMayor(planetas).nombre} con una masa de ${venus.planetaMayor(planetas).masa} kg")
    println("El planeta con menor masa es: ${tierra.planetaMenor(planetas).nombre} con una masa de ${marte.planetaMenor(planetas).masa} kg")
    println("La masa media de los planetas es: ${jupiter.masaMedia(planetas)} kg")
}

class Planeta(val nombre: String, var tipo: String, val masa: Double){
    init {
        if (tipo != "Rocoso" && tipo != "Gaseoso") {
            // throw Exception("El planeta $nombre no es de tipo 'Rocoso' o 'Gaseoso'")
            this.tipo = "Rocoso"
        }
    }
    fun planetaMayor(planetas: List<Planeta>): Planeta{
        val planetasOrdenados = planetas.sortedBy { this.masa }
        val planetaMayor = planetasOrdenados[planetasOrdenados.size - 1]
        return planetaMayor
    }

    fun planetaMenor(planetas: List<Planeta>): Planeta{
        val planetasOrdenados = planetas.sortedBy { this.masa }
        val planetaMenor = planetasOrdenados[0]
        return planetaMenor
    }

    fun masaMedia(planetas: List<Planeta>): Double{
        var masaTotal = 0.0
        var media = 0.0
        for (planeta in planetas) {
            masaTotal += planeta.masa
            media = masaTotal / planetas.size
        }
        return media
    }

    fun verMasa(): Double {
        return masa
    }

    fun verTipo(): String {
        return tipo
    }

    fun verNombre(): String {
        return nombre
    }
}


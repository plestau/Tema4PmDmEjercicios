package Ejercicio1

class Planeta(val nombre: String, val tipo: String, val masa: Double) {
    constructor(): this("Tierra", "Habitable", 5.972E24)
    fun mostrarNombre() {
        println("El nombre del planeta es $nombre")
    }

    fun mostrarTipo() {
        println("El tipo del planeta es $tipo")
    }

    fun mostrarMasa() {
        println("La masa del planeta es $masa")
    }

    override fun toString(): String {
        return "Planeta $nombre, de tipo '$tipo' y masa $masa kg"
    }
}

fun main() {
    val planeta = Planeta();
    planeta.mostrarNombre()
    planeta.mostrarTipo()
    planeta.mostrarMasa()
    println()
    val planeta2 = Planeta("Marte", "Rocoso", 6.39E23)
    println(planeta2)
}
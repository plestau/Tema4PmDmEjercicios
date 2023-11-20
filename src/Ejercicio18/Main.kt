package Ejercicio18

open class CuerpoCeleste{
    var masa: Double = 0.0
    var diametro: Double = 0.0
    var periodoRotacion: Double = 0.0
    var periodoTraslacion: Double = 0.0
    var distanciaMedia: Double = 0.0
    var excentricidad: Double = 0.0

    constructor(masa: Double, diametro: Double, periodoRotacion: Double, periodoTraslacion: Double, distanciaMedia: Double, excentricidad: Double){
        this.masa = masa
        this.diametro = diametro
        this.periodoRotacion = periodoRotacion
        this.periodoTraslacion = periodoTraslacion
        this.distanciaMedia = distanciaMedia
        this.excentricidad = excentricidad
    }

    override fun toString(): String {
        return "CuerpoCeleste(masa=$masa, diametro=$diametro, periodoRotacion=$periodoRotacion, periodoTraslacion=$periodoTraslacion, distanciaMedia=$distanciaMedia, excentricidad=$excentricidad)"
    }
}

class Planeta: CuerpoCeleste{
    var nombre: String = ""
    var satelites: MutableList<Satelite> = mutableListOf()

    constructor(masa: Double, diametro: Double, periodoRotacion: Double, periodoTraslacion: Double, distanciaMedia: Double, excentricidad: Double, nombre: String): super(masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia, excentricidad){
        this.nombre = nombre
    }

    fun addSatelite(satelite: Satelite) {
        satelite.planeta = this
        satelites.add(satelite)
    }

    fun imprimirInformacion(planeta: Planeta) {
        println("Nombre: ${planeta.nombre}")
        println("Masa: ${planeta.masa}")
        println("Diametro: ${planeta.diametro}")
        println("Periodo de rotacion: ${planeta.periodoRotacion}")
        println("Periodo de traslacion: ${planeta.periodoTraslacion}")
        println("Distancia media: ${planeta.distanciaMedia}")
        println("Excentricidad: ${planeta.excentricidad}")

        if (planeta.satelites.isNotEmpty()) {
            println("Satelites:")
            planeta.satelites.forEach { satelite ->
                println("  - ${satelite.nombre}")
            }
        } else {
            println("No tiene satelites.")
        }

        println()
    }

    override fun toString(): String {
        return "Planeta(nombre='$nombre', satelites=$satelites)"
    }
}

class Satelite: CuerpoCeleste{
    var nombre: String = ""
    var planeta: Planeta? = null

    constructor(masa: Double, diametro: Double, periodoRotacion: Double, periodoTraslacion: Double, distanciaMedia: Double, excentricidad: Double, nombre: String, planeta: Planeta): super(masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia, excentricidad){
        this.nombre = nombre
        this.planeta = planeta
    }

    fun imprimirInformacion(satelite: Satelite) {
        println("Nombre: ${satelite.nombre}")
        println("Masa: ${satelite.masa}")
        println("Diametro: ${satelite.diametro}")
        println("Periodo de rotacion: ${satelite.periodoRotacion}")
        println("Periodo de traslacion: ${satelite.periodoTraslacion}")
        println("Distancia media: ${satelite.distanciaMedia}")
        println("Excentricidad: ${satelite.excentricidad}")
        println("Planeta: ${satelite.planeta?.nombre ?: "Sin planeta asociado"}")
        println()
    }
}

fun main(args: Array<String>) {
    var mercurio = Planeta(3.285e23, 4.879e6, 58.646, 87.969, 5.791e7, 0.2056, "Mercurio")
    var venus = Planeta(4.867e24, 1.210e7, -243.018, 224.701, 1.082e8, 0.0068, "Venus")
    var tierra = Planeta(5.972e24, 1.275e7, 0.997, 365.256, 1.496e8, 0.0167, "Tierra")
    var luna = Satelite(7.347e22, 3.474e6, 27.322, 27.322, 3.844e5, 0.0549, "Luna", tierra)
    var marte = Planeta(6.390e23, 6.792e6, 1.026, 686.980, 2.279e8, 0.0934, "Marte")
    var fobos = Satelite(9.56e15, 2.27e3, 0.319, 0.319, 9.378e3, 0.0151, "Fobos", marte)
    var deimos = Satelite(1.48e15, 1.24e3, 1.262, 1.262, 2.345e4, 0.0003, "Deimos", marte)
    var jupiter = Planeta(1.898e27, 1.429e8, 0.414, 4332.59, 7.785e8, 0.0484, "Jupiter")
    var saturno = Planeta(5.683e26, 1.205e8, 0.426, 10759.22, 1.433e9, 0.0555, "Saturno")
    var urano = Planeta(8.681e25, 5.115e7, -0.718, 30685.4, 2.877e9, 0.0472, "Urano")
    var neptuno = Planeta(1.024e26, 4.952e7, 0.671, 60189.0, 4.503e9, 0.0086, "Neptuno")

    tierra.addSatelite(luna)
    marte.addSatelite(fobos)
    marte.addSatelite(deimos)

    var sistemaSolar: MutableList<Planeta> = mutableListOf(mercurio, venus, tierra, marte, jupiter, saturno, urano, neptuno)

    sistemaSolar.forEach { planeta ->
        planeta.imprimirInformacion(planeta)
    }

    sistemaSolar.forEach { planeta ->
        planeta.satelites.forEach { satelite ->
            satelite.imprimirInformacion(satelite)
        }
    }
}
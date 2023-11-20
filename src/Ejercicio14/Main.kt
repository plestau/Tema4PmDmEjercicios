package Ejercicio14

class Circunferencia{
    var radio: Double = 0.0
    var centro: Punto = Punto()
    var punto: Punto = Punto()

    constructor(radio: Double, centro: Punto, punto: Punto){
        this.radio = radio
        this.centro = centro
        this.punto = punto
    }

    constructor(radio: Double, centro: Punto){
        this.radio = radio
        this.centro = centro
    }

    fun longitud(): Double{
        return 2 * Math.PI * radio
    }

    override fun toString(): String {
        return "Circunferencia(radio=$radio, centro=$centro, punto=$punto)"
    }
}

class Punto{
    var x: Double = 0.0
    var y: Double = 0.0

    constructor(x: Double, y: Double){
        this.x = x
        this.y = y
    }

    constructor(){
        this.x = 0.0
        this.y = 0.0
    }

    override fun toString(): String {
        return "Punto(x=$x, y=$y)"
    }
}

fun main(args: Array<String>) {
    var circunferencia1 = Circunferencia(5.0, Punto(2.0, 3.0), Punto(2.0, 3.0))
    var circunferencia2 = Circunferencia(3.0, Punto(1.2, 2.3))
    println(circunferencia1)
    println(circunferencia2)
    println("Longitud circunferencia1: ${circunferencia1.longitud()}")
    println("Longitud circunferencia2: ${circunferencia2.longitud()}")
}
package Ejercicio2

fun main(args: Array<String>) {
    val triangulo1 = Triangulo(3.0, 3.0, 3.0)
    val triangulo2 = Triangulo(3.0, 3.0, 4.0)
    val triangulo3 = Triangulo(3.0, 4.0, 5.0)
    println(triangulo1.esRectangulo())
    println(triangulo2.esRectangulo())
    println(triangulo3.esRectangulo())
}

class Triangulo(var lado1: Double, var lado2: Double, var lado3: Double){
    fun tipo(): String {
        return when {
            lado1 == lado2 && lado2 == lado3 -> "Equilatero"
            lado1 == lado2 || lado2 == lado3 || lado1 == lado3 -> "Isosceles"
            else -> "Escaleno"
        }
    }
    fun esRectangulo(): Boolean {
        return when {
            lado1 == Math.sqrt(Math.pow(lado2, 2.0) + Math.pow(lado3, 2.0)) -> true
            lado2 == Math.sqrt(Math.pow(lado1, 2.0) + Math.pow(lado3, 2.0)) -> true
            lado3 == Math.sqrt(Math.pow(lado2, 2.0) + Math.pow(lado1, 2.0)) -> true
            else -> false
        }
    }
    override fun toString(): String {
        return "Triangulo(lado1=$lado1, lado2=$lado2, lado3=$lado3, tipo=${tipo()})"
    }
}
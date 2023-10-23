package Ejercicio2

class Triangulo(var lado1: Double, var lado2: Double, var lado3: Double){
    var perimetro: Double = lado1 + lado2 + lado3
    var tipo: String = ""
    var rectangulo: Boolean = false

    init {
        if(lado1 == lado2 && lado2 == lado3){
            tipo = "Equilatero"
        }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            tipo = "Isosceles"
        }else{
            tipo = "Escaleno"
        }
        rectangulo = esRectangulo()
    }

    fun esRectangulo(): Boolean{
        var hipotenusa: Double = 0.0
        var cateto1: Double = 0.0
        var cateto2: Double = 0.0
        if(lado1 > lado2 && lado1 > lado3){
            hipotenusa = lado1
            cateto1 = lado2
            cateto2 = lado3
        }else if(lado2 > lado1 && lado2 > lado3){
            hipotenusa = lado2
            cateto1 = lado1
            cateto2 = lado3
        }else{
            hipotenusa = lado3
            cateto1 = lado1
            cateto2 = lado2
        }
        return (hipotenusa*hipotenusa == cateto1*cateto1 + cateto2*cateto2)
    }

    override fun toString(): String {
        return "Triangulo de lados $lado1, $lado2 y $lado3, de tipo $tipo, con perimetro $perimetro y es rectangulo: $rectangulo"
    }
}
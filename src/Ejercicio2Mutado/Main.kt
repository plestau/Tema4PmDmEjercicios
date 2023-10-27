package Ejercicio2Mutado

fun main(){
    var rectangulo = Triangulo(5.0, 3.0, 4.0)
    var equilatero = Triangulo(3.0, 3.0, 3.0)
    var isosceles = Triangulo(3.0, 3.0, 4.0)
    var escaleno = Triangulo(3.0, 4.0, 5.0)
    println(rectangulo)
    println(equilatero)
    println(isosceles)
    println(escaleno)
}


class Triangulo{
    val hipotenusa: Double
    val l_lado1: Double
    val l_lado2: Double
    val perimetro: Double
    val tipo: String
    val esRectangulo: Boolean

    constructor(hipotenusa: Double, lado1: Double, lado2: Double){
        this.hipotenusa = hipotenusa
        this.l_lado1 = lado1
        this.l_lado2 = lado2
        this.perimetro = hipotenusa + lado1 + lado2
        if(hipotenusa == lado1 && lado1 == lado2){
            this.tipo = "Equilatero"
        }else if(hipotenusa == lado1 || lado1 == lado2 || hipotenusa == lado2){
            this.tipo = "Isosceles"
        }
        else{
            this.tipo = "Escaleno"
        }
        if(hipotenusa == Math.sqrt(Math.pow(lado1, 2.0) + Math.pow(lado2, 2.0))) {
            this.esRectangulo = true
        }else{
            this.esRectangulo = false
        }
    }
    private fun calculaArea(): Double{
        return (this.l_lado1 * this.l_lado2) / 2
    }
    private fun calculaAltura(): Double{
        return (this.l_lado1 * this.l_lado2) / this.hipotenusa
    }

    override fun toString(): String {
        return "Progama analizador de triángulos, con los datos: \n" +
                "Lado 1: ${this.hipotenusa} \n" +
                "Lado 2: ${this.l_lado1} \n" +
                "Lado 3: ${this.l_lado2} \n" +
                "Perímetro: ${this.perimetro} \n" +
                "Tipo: ${this.tipo} \n" +
                "Es rectángulo: ${this.esRectangulo} \n" +
                "Área: ${this.calculaArea()} \n" +
                "Altura: ${this.calculaAltura()} \n"
    }
}
package Ejercicio16

class Matematicas{
    var numero1 : Double = 0.0
    var numero2 : Double = 0.0

    constructor(numero1 : Double, numero2 : Double){
        this.numero1 = numero1
        this.numero2 = numero2
    }

    fun suma(): Double{
        return numero1 + numero2
    }

    fun resta(): Double{
        return numero1 - numero2
    }

    fun multiplicacion(): Double{
        return numero1 * numero2
    }

    fun division(): Double{
        return numero1 / numero2
    }
}
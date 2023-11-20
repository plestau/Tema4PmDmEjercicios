package Ejercicio17

open class Nota{
    var id: Int = 0
    var texto: String = ""

    constructor(id: Int, texto: String){
        this.id = id
        this.texto = texto
    }

    override fun toString(): String {
        return "Nota(id=$id, texto='$texto')"
    }
}

class NotaAlarma: Nota{
    var horaAlarma: String = ""

    constructor(id: Int, texto: String, horaAlarma: String): super(id, texto){
        this.horaAlarma = horaAlarma
    }

    override fun toString(): String {
        return "NotaAlarma(id=$id, texto='$texto', horaAlarma='$horaAlarma')"
    }
}

class BlocNotas{
    var notas: MutableList<Nota> = mutableListOf()

    fun addNota(nota: Nota){
        notas.add(nota)
    }

    fun listarNotas(){
        notas.forEach { println(it) }
    }

    fun eliminarNota(posicion: Int){
        notas.removeAt(posicion)
    }

    fun numeroNotas(): Int{
        return notas.size
    }
}

fun main(args: Array<String>) {
    var blocNotas = BlocNotas()
    var nota1 = Nota(1, "Nota 1")
    var nota2 = Nota(2, "Nota 2")
    var nota3 = Nota(3, "Nota 3")
    var notaAlarma1 = NotaAlarma(4, "Nota alarma 1", "12:00")
    var notaAlarma2 = NotaAlarma(5, "Nota alarma 2", "13:00")
    var notaAlarma3 = NotaAlarma(6, "Nota alarma 3", "14:00")
    blocNotas.addNota(nota1)
    blocNotas.addNota(nota2)
    blocNotas.addNota(nota3)
    blocNotas.addNota(notaAlarma1)
    blocNotas.addNota(notaAlarma2)
    blocNotas.addNota(notaAlarma3)
    blocNotas.listarNotas()
    println("Numero de notas: ${blocNotas.numeroNotas()}")
    blocNotas.eliminarNota(0)
    blocNotas.listarNotas()
    println("Numero de notas: ${blocNotas.numeroNotas()}")
}
package Ejercicio19

open class PNJ{
    var nombre: String = ""
    var PV: Int = 0
    var PM: Int = 0
    var LVL: Int = 0

    constructor(nombre: String, PV: Int, PM: Int, LVL: Int){
        this.nombre = nombre
        this.PV = PV
        this.PM = PM
        this.LVL = LVL
    }

    class Guerrero(nombre: String, PV: Int, PM: Int, LVL: Int): PNJ(nombre, PV, PM, LVL){
        fun levelUp(){
            PV += (PV * 0.08).toInt()
            PM += (PM * 0.01).toInt()
            LVL++
        }
    }
    class Mago(nombre: String, PV: Int, PM: Int, LVL: Int): PNJ(nombre, PV, PM, LVL){
        fun levelUp(){
            PV += (PV * 0.04).toInt()
            PM += (PM * 0.03).toInt()
            LVL++
        }
    }
}

fun main(args: Array<String>) {
    var guerrero = PNJ.Guerrero("Dave el Guerrero", 400, 50, 1)
    var mago = PNJ.Mago("Gandalf el Gris", 1600, 150, 1)
    var contador = 0

    while(guerrero.PV < mago.PV){
        guerrero.levelUp()
        mago.levelUp()
        contador++
    }
    println("EL guerrero tiene ${guerrero.PV} PV y el mago tiene ${mago.PV} PV y han subido de nivel ${contador} veces.")
}

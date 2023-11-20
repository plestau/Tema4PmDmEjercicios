package Ejercicio11

fun main(){
    var listaEquipos : ArrayList<EquipoFutbol> = arrayListOf(
    EquipoFutbol("Barcelona", "España"),
    EquipoFutbol("Real Madrid", "España"),
     EquipoFutbol("Manchester United", "Inglaterra"),
     EquipoFutbol("Juventus", "Italia"),
    EquipoFutbol("Betis", "España"),
    EquipoFutbol("Manchester City", "Inglaterra"),
     EquipoFutbol("Ajax", "Holanda"),
     EquipoFutbol("Liverpool", "Inglaterra"),
    EquipoFutbol("Tottenham", "Inglaterra"),
    EquipoFutbol("Oporto", "Portugal"),
     EquipoFutbol("Roma", "Italia"),
    EquipoFutbol("PSG", "Francia"),
    EquipoFutbol("Dortmund", "Alemania"),
   EquipoFutbol("Napoli", "Italia"),
    EquipoFutbol("Bayern", "Alemania")
    )

    listaEquipos[0].championsLeague(listaEquipos)
}

class EquipoFutbol{
    val nombre: String
    val pais: String

    constructor(nombre: String, pais: String){
        this.nombre = nombre
        this.pais = pais
    }

    fun championsLeague(equipos: ArrayList<EquipoFutbol>){
        val listaAuxiliar = ArrayList<EquipoFutbol>()
        val enfrentamientos = ArrayList<String>()

        for(equipo in equipos){
            listaAuxiliar.add(equipo)
        }
        while(listaAuxiliar.size > 1){
            val equipo1 = listaAuxiliar.random()
            listaAuxiliar.remove(equipo1)
            val equipo2 = listaAuxiliar.random()
            listaAuxiliar.remove(equipo2)
            enfrentamientos.add("${equipo1.nombre} vs ${equipo2.nombre}")
        }
        for(enfrentamiento in enfrentamientos){
            println(enfrentamiento)
        }
    }
}
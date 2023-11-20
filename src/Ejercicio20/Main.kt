package Ejercicio20

class Videojuego{
    var nombre: String = ""
    var ano: Int = 0
    var plataforma: String = ""

    constructor(nombre: String, ano: Int, plataforma: String){
        this.nombre = nombre
        this.ano = ano
        this.plataforma = plataforma
    }

    fun filtrarJuegos(videojuegos: MutableList<Videojuego>, ano: Int, plataforma: String): MutableList<Videojuego>{
        var juegosFiltrados: MutableList<Videojuego> = mutableListOf()
        videojuegos.forEach { videojuego ->
            if(videojuego.ano == ano && videojuego.plataforma == plataforma){
                juegosFiltrados.add(videojuego)
            }
        }
        return juegosFiltrados
    }

    fun filtrarJuegosAno(ano: Int, listaJuegos: MutableList<Videojuego>): MutableList<Videojuego>{
        var juegosFiltrados: MutableList<Videojuego> = mutableListOf()
        listaJuegos.forEach { videojuego ->
            if(videojuego.ano == ano){
                juegosFiltrados.add(videojuego)
            }
        }
        return juegosFiltrados
    }

    fun filtrarJuegosNombre(nombre: String, listaJuegos: MutableList<Videojuego>): MutableList<Videojuego>{
        var juegosFiltrados: MutableList<Videojuego> = mutableListOf()
        listaJuegos.forEach { videojuego ->
            if(videojuego.nombre == nombre){
                juegosFiltrados.add(videojuego)
            }
        }
        return juegosFiltrados
    }

    fun filtrarJuegosPlataforma(plataforma: String, listaJuegos: MutableList<Videojuego>): MutableList<Videojuego>{
        var juegosFiltrados: MutableList<Videojuego> = mutableListOf()
        listaJuegos.forEach { videojuego ->
            if(videojuego.plataforma == plataforma){
                juegosFiltrados.add(videojuego)
            }
        }
        return juegosFiltrados
    }


}

fun main(args: Array<String>) {
    var videojuegos: MutableList<Videojuego> = mutableListOf()
    videojuegos.add(Videojuego("Halo", 2001, "Xbox"))
    videojuegos.add(Videojuego("Halo Infinite", 2022, "Xbox"))
    videojuegos.add(Videojuego("God of War", 2005, "PlayStation"))
    videojuegos.add(Videojuego("God of War: Ragnarok", 2022, "PlayStation"))
    videojuegos.add(Videojuego("The Legend of Zelda", 1986, "Nintendo"))
    videojuegos.add(Videojuego("The Legend of Zelda: Breath of the Wild", 2017, "Nintendo"))
    videojuegos.add(Videojuego("Super Mario Odyssey", 2017, "Nintendo"))
    videojuegos.add(Videojuego("Crash Bandicoot", 1996, "PlayStation"))

    var juegosModernosXbox: MutableList<Videojuego> = videojuegos[0].filtrarJuegos(videojuegos, 2022, "Xbox")

    var juegos2022: MutableList<Videojuego> = videojuegos[0].filtrarJuegosAno(2022, videojuegos)

    println("Juegos modernos de Xbox:")
    juegosModernosXbox.forEach { videojuego ->
        println("  - ${videojuego.nombre}")
    }

    println()
    println("Juegos del 2022:")
    juegos2022.forEach { videojuego ->
        println("  - ${videojuego.nombre}")
    }
}



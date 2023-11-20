package Ejercicio21


class Videojuego{
    var nombre: String = ""
    var ano: Int = 0
    var plataforma: String = ""

    constructor(nombre: String, ano: Int, plataforma: String){
        this.nombre = nombre
        this.ano = ano
        this.plataforma = plataforma
    }

    fun filtrarJuegos(videojuegos: MutableList<Videojuego>, anos: MutableList<Int>, plataformas: MutableList<String>): MutableList<Videojuego>{
        var juegosFiltrados: MutableList<Videojuego> = mutableListOf()
        videojuegos.forEach { videojuego ->
            anos.forEach { ano ->
                plataformas.forEach { plataforma ->
                    if(videojuego.ano == ano && videojuego.plataforma == plataforma){
                        juegosFiltrados.add(videojuego)
                    }
                }
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

    var anos: MutableList<Int> = mutableListOf()
    anos.add(2022)
    anos.add(2005)
    var plataformas: MutableList<String> = mutableListOf()
    plataformas.add("Xbox")
    plataformas.add("PlayStation")

    var juegosFiltrados: MutableList<Videojuego> = videojuegos[0].filtrarJuegos(videojuegos, anos, plataformas)

    juegosFiltrados.forEach { videojuego ->
        println("Nombre: ${videojuego.nombre}")
        println("Año: ${videojuego.ano}")
        println("Plataforma: ${videojuego.plataforma}")
        println()
    }
}



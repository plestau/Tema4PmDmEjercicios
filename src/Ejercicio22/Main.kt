package Ejercicio22

class Videojuego{
    var nombre: String = ""
    var ano: Int = 0
    var plataforma: String = ""

    constructor(nombre: String, ano: Int, plataforma: String){
        this.nombre = nombre
        this.ano = ano
        this.plataforma = plataforma
    }

    fun contarJuegosPlataforma(videojuegos: MutableList<Videojuego>): MutableMap<String, Int>{
        var juegosPlataforma: MutableMap<String, Int> = mutableMapOf()
        videojuegos.forEach { videojuego ->
            if(juegosPlataforma.containsKey(videojuego.plataforma)){
                juegosPlataforma[videojuego.plataforma] = juegosPlataforma[videojuego.plataforma]!! + 1
            }else{
                juegosPlataforma[videojuego.plataforma] = 1
            }
        }
        return juegosPlataforma
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

    var juegosPlataforma: MutableMap<String, Int> = videojuegos[0].contarJuegosPlataforma(videojuegos)

    juegosPlataforma.forEach { plataforma, cantidad ->
        println("Plataforma: ${plataforma}")
        println("Cantidad: ${cantidad}")
        println()
    }
}



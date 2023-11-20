package Ejercicio6

fun main() {
    val mercurio = Planeta("Mercurio", "Rocoso", 3.3011E23)
    val venus = Planeta("Venus", "Rocoso", 4.8675E24)
    val tierra = Planeta("Tierra", "Habitable", 5.972E24)
    val marte = Planeta("Marte", "Rocoso", 6.39E23)
    val jupiter = Planeta("Jupiter", "Gaseoso", 1.898E27)
    val saturno = Planeta("Saturno", "Gaseoso", 5.683E26)
    val urano = Planeta("Urano", "Gaseoso", 8.681E25)
    val neptuno = Planeta("Neptuno", "Gaseoso", 1.024E26)
    val pluton = Planeta("Plutón", "Cometa", 1.30E22)
    val planetas = arrayListOf(mercurio, venus, tierra, marte, jupiter, saturno, urano, neptuno, pluton)
    mercurio.mostrarInfo(planetas)
    mercurio.mostrarPlanetasM(planetas)
    mercurio.mostrarGaseososMasPesados(planetas, (tierra.masa * 20))
    mercurio.masaMedia(planetas)
}

class Planeta(val nombre: String, var tipo: String, val masa: Double){
    init {
        if (tipo != "Rocoso" && tipo != "Gaseoso") {
            // throw Exception("El planeta $nombre no es de tipo 'Rocoso' o 'Gaseoso'")
            this.tipo = "Rocoso"
        }
    }

    fun mostrarInfo(planetas: ArrayList<Planeta>){
        for(planeta in planetas){
            println("Nombre: ${planeta.nombre}")
            println("Tipo: ${planeta.tipo}")
            println("Masa: ${planeta.masa}")
            println()
        }
    }
    fun mostrarPlanetasM(planetas: ArrayList<Planeta>){
        for(planeta in planetas){
            if(planeta.nombre.startsWith("M")){
                println("Planeta que empieza por M: ${planeta.nombre}")
            }
        }
    }
    fun mostrarGaseososMasPesados(planetas: ArrayList<Planeta>, masa: Double){
        for(planeta in planetas){
            if(planeta.tipo == "Gaseoso" && planeta.masa > masa){
                println("Planeta gaseoso más pesado: ${planeta.nombre}")
            }
        }
    }
    fun masaMedia(planetas: ArrayList<Planeta>){
        var masaTotal = 0.0
        var media = 0.0
        for (planeta in planetas) {
            masaTotal += planeta.masa
            media = masaTotal / planetas.size
        }
        println("La masa media de los planetas del Sistema Solar es: $media kg")
    }
}


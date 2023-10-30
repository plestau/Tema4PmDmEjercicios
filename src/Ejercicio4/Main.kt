package Ejercicio4

fun main(){
    val juan = Estudiante("Juan", 22, 10.0)
    val pedro = Estudiante("Pedro", 32, 7.5)
    val maria = Estudiante("Maria", 20, 8.0)
    juan.agregarEstudiante(juan)
    pedro.agregarEstudiante(pedro)
    maria.agregarEstudiante(maria)
    juan.mostrarEstudiante()
    pedro.mostrarEstudiante()
    maria.mostrarEstudiante()
    juan.calcularPromedio()
}

class Estudiante{
    val estudiantes = ArrayList<Estudiante>()
    val nombre: String
    val edad: Int
    val notas: Double

    constructor(nombre: String, edad: Int, notas: Double){
        this.nombre = nombre
        this.edad = edad
        this.notas = notas
    }
    fun agregarEstudiante(estudiante: Estudiante){
        estudiantes.add(estudiante)
    }
    fun mostrarEstudiante(){
        for(estudiante in estudiantes){
            println("Nombre: ${estudiante.nombre}")
            println("Edad: ${estudiante.edad}")
            println("Calificación: ${estudiante.notas}")
            println()
        }
    }
    fun calcularPromedio(){
        var promedio = 0.0
        for(estudiante in estudiantes){
            promedio += estudiante.notas
        }
        promedio /= estudiantes.size
        println("El promedio de notas es: $promedio")
    }
}
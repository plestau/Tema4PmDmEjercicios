package Ejercicio3

fun main(){
    val juan = Contacto("Juan", "juan@gmail.com", 123456789)
    val pedro = Contacto("Pedro", "pedro@hotmail.com", 987654321)
    val maria = Contacto("Maria", "maria@outlook.com", 456789123)
    val contactos = ArrayList<Contacto>()
    juan.agregarContacto(juan, contactos)
    pedro.agregarContacto(pedro, contactos)
    maria.agregarContacto(maria, contactos)
    pedro.eliminarContacto("Pedro", contactos)
    juan.mostrarContactos(contactos)
}

class Contacto{
    val nombre: String
    val correo: String
    val telefono: Int

    constructor(nombre: String, correo: String, telefono: Int){
        this.nombre = nombre
        this.correo = correo
        this.telefono = telefono
    }
    fun agregarContacto(contacto: Contacto, listaContactos: ArrayList<Contacto>){
        listaContactos.add(contacto)
    }
    fun eliminarContacto(nombre: String, listaContactos: ArrayList<Contacto>){
        for(contacto in listaContactos){
            if(contacto.nombre == nombre){
                listaContactos.remove(contacto)
            }
        }
    }
    fun mostrarContactos(listaContactos: ArrayList<Contacto>){
        for(contacto in listaContactos){
            println("Nombre: ${contacto.nombre}")
            println("Correo: ${contacto.correo}")
            println("Teléfono: ${contacto.telefono}")
            println()
        }
    }
}
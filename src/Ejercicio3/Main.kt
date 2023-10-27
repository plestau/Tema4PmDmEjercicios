package Ejercicio3

fun main(){
    val juan = Contacto("Juan", "juan@gmail.com", 123456789)
    val pedro = Contacto("Pedro", "pedro@hotmail.com", 987654321)
    val maria = Contacto("Maria", "maria@outlook.com", 456789123)
    juan.agregarContacto(juan)
    pedro.agregarContacto(pedro)
    maria.agregarContacto(maria)
    pedro.eliminarContacto("Pedro")
    maria.mostrarContactos()
    juan.mostrarContactos()
    pedro.mostrarContactos()
}

class Contacto{
    val contactos = ArrayList<Contacto>()
    val nombre: String
    val correo: String
    val telefono: Int

    constructor(nombre: String, correo: String, telefono: Int){
        this.nombre = nombre
        this.correo = correo
        this.telefono = telefono
    }

    fun agregarContacto(contacto: Contacto){
        contactos.add(contacto)
    }
    fun eliminarContacto(nombre: String){
        for(contacto in contactos){
            if(contacto.nombre == nombre){
                contactos.remove(contacto)
                break
            }
        }
    }
    fun mostrarContactos(){
        for(contacto in contactos){
            println("Nombre: ${contacto.nombre}")
            println("Correo: ${contacto.correo}")
            println("Telefono: ${contacto.telefono}")
            println()
        }
    }
}
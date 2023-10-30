package Ejercicio5

fun main(){
    val producto1 = Producto("Arroz", 3.5, 2)
    val producto2 = Producto("Leche", 2.5, 3)
    val producto3 = Producto("Huevos", 1.0, 5)
    val productos = ArrayList<Producto>()

    producto1.agregarProducto(producto1, productos)
    producto2.agregarProducto(producto2, productos)
    producto3.agregarProducto(producto3, productos)
    producto1.actualizarStock("Arroz", 5, productos)
    producto2.actualizarStock("Leche", 5, productos)
    producto1.mostrarStock(productos)
}

class Producto{
    val nombre: String
    val precio: Double
    var cantidad: Int

    constructor(nombre: String, precio: Double, cantidad: Int){
        this.nombre = nombre
        this.precio = precio
        this.cantidad = cantidad
    }
    fun agregarProducto(producto: Producto, listaProductos: ArrayList<Producto>){
        listaProductos.add(producto)
    }
    fun actualizarStock(nombre: String, cantidad: Int, listaProductos: ArrayList<Producto>){
        for(producto in listaProductos){
            if(producto.nombre == nombre) {
                producto.cantidad = cantidad
                println("Se actualizó el stock del producto $nombre")
            }
        }
    }
    fun mostrarStock(listaProductos: ArrayList<Producto>){
        for(producto in listaProductos){
            println("Nombre: ${producto.nombre}")
            println("Precio: ${producto.precio}")
            println("Cantidad: ${producto.cantidad}")
            println()
        }
    }
}
// https://developer.android.com/training/kotlinplayground



open class Item(val nombre: String, val precio: Int)

class Fideos : Item("Fideos", 10){
    override fun toString(): String {
        return nombre
    }
}

class Orden(val numeroOrden: Int){
    private val listaItems = mutableListOf<Item>()

    fun agregarItem(nuevoItem: Item){
        listaItems.add(nuevoItem)
    }

    fun agregarTodos(nuevosItems: List<Item>){
        listaItems.addAll(nuevosItems)
    }

    fun listar(){
        println("Orden #${numeroOrden}")
        var total = 0
        for (item in listaItems){
            println("${item}: $${item.precio}")
            total += item.precio
        }
        println("Total: $${total}")
    }
}

//class Vegetales(val topping1: String, val topping2: String, val topping3: String) : Item("Vegetales", 5){
//class Vegetales(val toppings: List<String>) : Item("Vegetales", 5){
class Vegetales(vararg val toppings: String) : Item("Vegetales", 5){
    override fun toString(): String {
        if (toppings.isEmpty()){
            return "$nombre Elección del chef"
        }
        else
            return nombre + " " + toppings.joinToString()
    }
}

fun main() {
    val fideos = Fideos()
    val vegetales1 = Vegetales("Cebolla", "Calabaza", "Zanahoria")
    val vegetales2 = Vegetales()
    println(fideos)
    println(vegetales1)
    println(vegetales2)

    val orden = Orden(1)
    orden.agregarItem(vegetales1)
    orden.agregarItem(fideos)
    orden.listar()
}
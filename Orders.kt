// https://developer.android.com/training/kotlinplayground



open class Item(val nombre: String, val precio: Int)

class Fideos : Item("Fideos", 10){
    override fun toString(): String {
        return nombre
    }
}

class Orden(val numeroOrden: Int){
    private val listaItems = mutableListOf<Item>()

    fun agregarItem(nuevoItem: Item): Orden{
        listaItems.add(nuevoItem)
        return this
    }

    fun agregarTodos(nuevosItems: List<Item>): Orden{
        listaItems.addAll(nuevosItems)
        return this
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
    val ordersList = mutableListOf<Orden>()

    val order1 = Orden(1)
    order1.agregarItem(Fideos())
    ordersList.add(order1)

    val order2 = Orden(2)
    order2.agregarItem(Fideos())
    order2.agregarItem(Vegetales())
    ordersList.add(order2)

    val order3 = Orden(3)
    val items = listOf(Fideos(), Vegetales("Carrots", "Beans", "Celery"))
    order3.agregarTodos(items)
    ordersList.add(order3)

    val order4 = Orden(4).agregarItem((Fideos()).agregarItem((Vegetales("Cabbage", "Onion"))
    ordersList.add(order4)

    ordersList.add(
        Orden(5)
            .agregarItem((Fideos())
            .agregarItem((Fideos())
            .agregarItem((Vegetales("Spinach")))

    for (order in ordersList) {
        order.listar()
        println()
    }
}
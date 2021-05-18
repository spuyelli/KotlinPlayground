// https://developer.android.com/training/kotlinplayground



open class Item(val nombre: String, val precio: Int)

class Fideos : Item("Fideos", 10){
    override fun toString(): String {
        return nombre
    }
}

class Vegetales : Item("Vegetales", 5){
    override fun toString(): String {
        return nombre
    }
}

fun main() {
    val fideos = Fideos()
    val vegetales = Vegetales("Cebolla", "Calabaza", "Zanahoria")
    println(fideos)
    println(vegetales)
}
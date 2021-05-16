// https://developer.android.com/training/kotlinplayground


fun main() {
    val pastas = mutableListOf<String>()
    //val pastas: MutableList<String> = mutableListOf()     // Otra forma correcta de inicializar la lista vacía

    println("Pastas: $pastas")
    println("Agregamos fideos: ${pastas.add("fideos")}")
    println("Pastas: $pastas")
    println("Agregamos spaghetti: ${pastas.add("spaghetti")}")
    println("Pastas: $pastas")
    
    // Se agregan elementos a partir de una variable tipo List
    val masItems = listOf("ravioles", "lasagna", "fettuccine")
    println("Agregamos lista: ${pastas.addAll(masItems)}")
    println("Pastas: $pastas")
    
    // Se pueden quitar elementos por su valor
    println("Retiramos spaghetti: ${pastas.remove("spaghetti")}")
    println("Pastas: $pastas")

    // Se pueden quitar elementos por su índice
    println("Retiramos el primer elemento: ${pastas.removeAt(0)}")
    println("Pastas: $pastas")

    // Se puede vaciar la lista
    pastas.clear()
    println("Pastas: $pastas")

    // Se verifica que no contenca elementos la lista mutable con respuesta bool
    println("Vacía? ${pastas.isEmpty()}")
}
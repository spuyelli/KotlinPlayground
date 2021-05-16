// https://developer.android.com/training/kotlinplayground


fun main() {
    // val numeros: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    // Si el tipo de dato del array puede resultar obvio, se puede omitir en la creación de variable
    val numeros = listOf(1, 2, 3, 4, 5, 6)
    println("Lista: $numeros")      // También posible como: println("Lista: " + numeros)
    println("Tamaño: ${numeros.size}")
    
    println("Primer elemento: ${numeros[0]}")               // Ambas opciones son
    println("Primer elemento (alt): ${numeros.first()}")    // igual de válidas
    
    println("Segundo elemento: ${numeros.get(1)}")          // Otra forma de acceder al elemento específico
    
    println("Último elemento: ${numeros[numeros.size - 1]}")
    println("ültimo elemento (alt): ${numeros.last()}")

    // Busca un valor en la lista y devuelve true o false
    println("Contiene 4? ${numeros.contains(4)}")
    println("Contiene 7? ${numeros.contains(7)}")

    println("------------------------------------")

    val colores = listOf("verde", "naranja", "azul")

    // Como las listas son de "solo lectura", no se pueden agregar elementos después de creada la misma
    // colores.add("violeta")
    // colores[0] = "amarillo"

    println("Lista: $colores")
    println("Lista revertida: ${colores.reversed()}")

    println("Lista ordenada: ${colores.sorted()}")

    val numerosDesordenados = listOf(5, 3, 7, 1)
    println("Lista: $numerosDesordenados")
    println("Lista ordenada: ${numerosDesordenados.sorted()}")
    

}
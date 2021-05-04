// https://developer.android.com/training/kotlinplayground

fun main() {
    val squareCabin = SquareCabin(6, 50.0)

   with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
    }
    
    
    val roundHut = RoundHut(3)

    with(roundHut){
        println("\nRound Hut\n==========")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
    }

    
    val roundTower = RoundTower(4)

    with(roundTower) {
        println("\nRound Tower\n==========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
    }
}

abstract class Dwelling(private var residents: Int) {
	abstract val buildingMaterial: String
    abstract val capacity: Int
    
    fun hasRoom(): Boolean {
        return residents < capacity
    }

    abstract fun floorArea(): Double
}

class SquareCabin(residents: Int, val length: Double) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6

    override fun floorArea(): Double{
        return length * length
    }
}

open class RoundHut(residents: Int, val length: Double) : Dwelling(residents){
    override val buildingMaterial = "Straw"
    override val capacity = 4

    override fun floorArea(): Double{
        return PI * radius * radius
    }
}

class RoundTower(residents:Int, val floors: Int = 2) : RoundHut(residents){
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
}
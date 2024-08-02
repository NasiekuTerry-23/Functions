import kotlin.math.sqrt

fun main(){
    addNumbers(12, 24)

}

private fun addNumbers(n1 : Int, n2 : Int, message : String = "This is a default string"){

    val total = n1 + n2
    println("Total = $total")
    println(message)
}
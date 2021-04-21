fun main() {
    val rectangleResult = Rectangle(10, 5, "Red")
    val triangleResult = Triangle(5, 10, "Blue")

    println(rectangleResult.toString())
    println(rectangleResult.color)
    println()

    println(triangleResult.toString())
    println(triangleResult.color)


}

abstract class Shape(val color: String){

    abstract fun getArea(): Double

    override fun toString(): String {
        return "The Color of shape is $color"
    }
}

class Rectangle(private val length: Int, private val width: Int, color: String): Shape(color){

    override fun getArea(): Double {
        return length * width.toDouble()
    }

    override fun toString(): String {
        return "The Area of Rectangle is ${getArea()}"
    }
}
class Triangle(private val base: Int, private val height: Int, color: String): Shape(color){
    override fun getArea(): Double {
        return 0.5 * base * height
    }

    override fun toString(): String {
        return "The Area of Triangle is ${getArea()}"
    }
}


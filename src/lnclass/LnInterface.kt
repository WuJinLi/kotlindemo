package lnclass


/**
 * 接口
 */
fun main() {
    Car(_name = "捷达").move(100)
}

interface Moveable {
    var wheels: Int

    fun move(maxSpeed: Int)
}

class Car(_name: String, override var wheels: Int = 4) : Moveable {

    var name = _name

    override fun move(maxSpeed: Int) {
        println("$name has $wheels wheels , maxSpeed is $maxSpeed km/h")
    }

}
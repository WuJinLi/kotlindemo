package lnclass

/**
 * reified关键字使用，在kotlin中实现范型类型检查
 */
fun main() {
    var box: Box<Fruit> = Box()

    var fruit = box.getFruitFromBox {
        Apple("烟台系列", 1.32)
    }
    println(fruit)
}

open class Fruit(var price: Double)

class Apple(var name: String, price: Double) : Fruit(price) {
    override fun toString(): String {
        return "apple[name = $name ,price = $price]"
    }
}

class Banner(var name: String, price: Double) : Fruit(price) {
    override fun toString(): String {
        return "Banner[name = $name ,price = $price]"
    }
}

class Orange(var name: String, price: Double) : Fruit(price) {
    override fun toString(): String {
        return "Banner[name = $name ,price = $price]"
    }
}

class Box<T> {

//    fun <T> getFruitFromBox(backUp: () -> T): T {
//        var fruits = listOf(
//            Apple("红富士", 4.15),
//            Banner(" 进口", price = 3.12)
//        )
//        var random = fruits.shuffled().first()
//
//        return if (random is T) {
//            random
//        } else {
//            backUp()
//        }
//    }

    inline fun <reified T> getFruitFromBox(backUp: () -> T): T {
        var fruits = listOf(
            Apple("红富士", 4.15),
            Banner(" 进口", price = 3.12),
            Orange("脐橙", 12.43)
        )
        var random = fruits.shuffled().first()

        return if (random is T) {
            random
        } else {
            backUp()
        }
    }
}
package lnclass


/**
 * 协变：out   子范型对象类赋值给父类范型对象
 * 逆变：in    父类范型对象赋值给子类范型对象
 */
fun main() {
    val production1: Production<Food> = FoodStore()
    val production2: Production<Food> = FastFoodStore()
    val production3: Production<Food> = BurgerStore()


    val consumer1: Consumer<Burger> = EveryBody()
    val consumer2: Consumer<Burger> = ModernPeople()
    val consumer3: Consumer<Burger> = AmicanPeople()
}

//生产者
interface Production<out T> {
    fun product(): T
}

//消费者
interface Consumer<in T> {
    fun consume(item: T)
}


open class Food
open class FastFood : Food()
open class Burger : FastFood()

class FoodStore : Production<Food> {
    override fun product(): Food {
        return Food()
    }
}

class FastFoodStore : Production<FastFood> {
    override fun product(): FastFood {
        return FastFood()
    }
}

class BurgerStore : Production<Burger> {
    override fun product(): Burger {
        return Burger()
    }
}


//消费者
class EveryBody : Consumer<Food> {
    override fun consume(item: Food) {
        println("Eat Food")
    }
}

class ModernPeople : Consumer<FastFood> {
    override fun consume(item: FastFood) {
        println("Eat FastFood")
    }
}

class AmicanPeople : Consumer<Burger> {
    override fun consume(item: Burger) {
        println("Eat Burger")
    }
}
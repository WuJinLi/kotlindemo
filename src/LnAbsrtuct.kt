fun main() {
    Man().apply {
        eat()
        getInfo()
        walk()
    }
}


abstract class AbstructClass {
    abstract fun eat()
    open fun walk() {
        println("AbstructClass walk")
    }

    abstract fun getInfo()
}


class Man : AbstructClass() {
    override fun eat() {
        println("Man eat")
    }

    override fun getInfo() {
        println("Man getInfo")
    }

    override fun walk() {
        super.walk()
    }
}

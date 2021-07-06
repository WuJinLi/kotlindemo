fun main() {
    Stude(ImHuman()).eat("apple")
}

interface Human {
    fun eat(str: String)

    fun useTraffic(str: String)
}

open class ImHuman : Human {
    override fun eat(str: String) {
        println("eat $str")
    }

    override fun useTraffic(str: String) {
        println("use traffic is $str")
    }
}


class Stude(human: Human) : Human by human


interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

class Derived(b: BaseImpl) : Base by b
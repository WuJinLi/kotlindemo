fun main(args: Array<String>) {
//    Person().run {
//        eat()
//        say()
//    }
//
//    Person().let {
//        it.eat()
//        it.say()
//    }

//    InitOrderDemo("hello")

//    People().info()
    People("zhangsan").info()
//    People("wangwu", 20).info()

//    Person().info()
}


open class People() {
    var name: String = ""
    var age: Int = 0

    init {
        println("this blocks is People init function")
    }

    constructor(name: String) : this() {
        this.name = name
        this.age = 0
    }

    constructor(name: String, age: Int) : this() {
        this.name = name
        this.age = age
    }


    open fun eat() {
        println("this People eat")
    }

    open fun say() {
        println("this People say")
    }

    open fun info() {
        println("this people name is $name,age is ${age}")
    }
}

class Person : People() {

    init {
        println("this blocks is Person init function")
    }

    override fun eat() {
        println("this Person eat")
    }

    override fun say() {
        println("this Person eat")
    }

    override fun info() {
        super.info()
    }
}

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}
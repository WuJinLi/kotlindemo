
interface MyInterface {
    fun eat()
    fun run()
    fun walk()
    fun study()
}

class Student : MyInterface {
    override fun eat() {
        println("Student eat")
    }

    override fun run() {
        println("Student run")
    }

    override fun walk() {
        println("Student walk")
    }

    override fun study() {
        println("Student study")
    }

}



fun interface IntPredicat{
    fun accept(i:Int):Boolean
}





fun main(args: Array<String>) {
//    Student().apply {
//        eat()
//        run()
//        walk()
//        study()
//    }

//    val isEven = object :IntPredicat{
//        override fun accept(i: Int): Boolean {
//            return i%2==0
//        }
//    }
//    print(isEven.accept(12))

    val isEven1 = IntPredicat{it % 2 ==0}
    println(isEven1.accept(5))
}
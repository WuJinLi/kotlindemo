package lnclass

fun main() {
    //对象声明（实现单例）
//    Application.setSomething("object 对象声明")
//    println(Application)
//    println(Application)
//    println(Application)

    //对象表达式
//    Application.setOnClickListener(object : OnClickListener {
//        override fun onClick() {
//            println("object 实现对象表达式")
//        }
//    })

    //伴生对象
//    Config().load()
    Config.load()
}


/**
 * object:实现对象的声明，对象的创建属于单例
 * 1.类名及为对象名
 * 2.对象在程序内存中实现单例模式
 * 3.类名直接调用类的函数、属性
 */
object Application {

    init {
        println("loading config...")
    }

    fun setSomething(str: String) {
        println("Å$str")
    }

    fun setOnClickListener(listener: OnClickListener) {
        listener.onClick()
    }
}


/**
 * object：实现对象表达式
 */
interface OnClickListener {
    fun onClick()
}


/**
 * object：实现伴生对象功能 使用companion来修饰
 *
 * 将某个对象的初始化和一个类的实力捆绑在一起，可以使用伴生对象，一个类里边只能有一个伴生对象
 * 相当与java中的static修饰的方法或者属性，通过类名直接调用
 */
class Config {
    fun load() {
        println("类方法")
    }

    companion object {
        fun load() {
            println("伴生对象初始化")
        }
    }
}
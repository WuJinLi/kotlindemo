import com.wjl.kotlin.extension.randomTake
import lnclass.Machine
import java.io.File

/**
 * 定义拓展函数：
 * 在不直接修改类的情况下增加类的功能，拓展可用于自定义类，也可以用于kotlin中已有类。和继承相似，拓展也能实现共享类行为，
 * 在你无法接触某个类定义、或者某个类没有定义open修饰符，导致你无法继承，则选择拓展增加类的功能
 */

fun main() {
//    var bycycle = Bycycle("自行车", "交通工具")
//    println(bycycle.addSubFunction("非机动车"))
//    bycycle.let {
//
//    }

//    println("The sun is shining. Birds are chirping.".count {
//        "i".contains(it)
//    })

//    var str1:String?=null
//    var str1: String = "Rsoe"

//    str1.printOrDefaul("123")
//    str1 printOrDefaul "123"

//    "张撒" to 12


    var list = listOf("zhansgan", "lisi", "wangwu")
//    var set = setOf("Tom", "Jack", "Rose")
//
//    println(list.randomTake())
//    println(set.randomTake())


}

fun String.addWarning(time: Int) = this + "!".repeat(time)


open class Machine(var function: String) {
    fun function() {
        println(function)
    }
}

fun Machine.addSubFunction(subFunction: String) = this.function + subFunction

class Bycycle(var name: String, function: String) : Machine(function) {
    override fun toString(): String {
        return "name:$name ,function:$function"
    }
}

//范型拓函数
fun <T> T.easyPrint(): T {
    println(this)
    return this
}

//infix关键字 适用于单个参数的扩展和类函数
//fun String?.printOrDefaul(default:String)= println(this?:default)
infix fun String?.printOrDefaul(default: String) = println(this ?: default)


fun <T> T.applyCustom(block: T.() -> Unit): T {
    block
    return this
}


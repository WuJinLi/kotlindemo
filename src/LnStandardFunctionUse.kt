import java.io.File

/**
 * kotiln标准函数库的使用 let 、apply、 run、 with
 */

fun main() {
//    standardOfLetUse()
//    standardOfLetUse1()
//    standardOfNormalDealObj()
//    standardOfApplyUse()
//    standardOfRunUse()
}

/**
 * let 返回值为方法体中最后一条执行语句
 * 配合?.与?:使用
 */
fun standardOfLetUse() {
    val str: String? = null
    print(str?.let { value ->
        if (value.contains(Regex("[ac]"))) {
            value.replace(Regex("[ac]")) {
                when (it.value) {
                    "a" -> "A"
                    "c" -> "C"
                    else -> it.value
                }
            }
        } else {
            value
        }
    } ?: "")
}

fun standardOfLetUse1() {
//    var arr = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println((1..10).shuffled().first().let {
        it * it
    })
}

/**
 * 传统，修改对象属性或者调用对象方法
 */
fun standardOfNormalDealObj() {
    val stud = Stud("Rose", 12)
    stud.age = 22
    stud.name = "ruby"

    print(stud.toString())
}

/**
 * apply 配置函数，及对象调用apply函数，在函数体内进行当前对象内方法调用，返回值为当前对象本身
 */
fun standardOfApplyUse() {
    val stud = Stud("Rose", 12)
    stud.apply {
        name = "Jack"
        age = 15
    }.toString()
    print(stud)
}

/**
 * run 光看行为和apply差不多，但是run函数不返回接受者，而是返回lambda结果，也就是true false
 */
fun standardOfRunUse() {
    val stud = Stud("Rose", 12)
    stud.run {
        name = "Jack"
        age = 15
    }
    print(stud.toString())
}

private class Stud(var name: String, var age: Int) {
    override fun toString(): String {
        return "[name:$name,age:$age]"
    }
}
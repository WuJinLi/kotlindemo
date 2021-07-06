import java.io.File
import java.nio.charset.Charset

/**
 * kotiln标准函数库的使用 let 、apply、 run、 with、also、takeif、takeUnless
 */

fun main() {
//    standardOfLetUse()
//    standardOfLetUse1()
//    standardOfNormalDealObj()
//    standardOfApplyUse()
//    standardOfRunUse()
//    standardOfRunUse1()
//    standardOfWithUse()
//    standardOfAlsoUse()
//    standardOfTakeifUse()
    standardOfTakeUnlessUse()
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
 * also函数与let函数功能相似，和let一样，also将接受者作为值参传给lambda，但与一点also返回接受者对象，而let返回lambda结果；
 * 因为这个差异，also尤其适合针对同一个原始对象，利用副作用做事，可以基于原始对象接受者执行额外的链式调用
 */
fun standardOfAlsoUse() {
    var fileContents: List<String>
    File("/Users/WuJinLi/Desktop/test.txt").also {
        println(it.name)
    }.also {
        fileContents = it.readLines(Charsets.UTF_8)
    }

    println(fileContents)
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

/**
 *run方法实现链式调用、::实现函数引用调用
 */
fun standardOfRunUse1() {
    val str = "The people's Republic of China"
    str.run(::isTooLong).run(::showMessage).run(::print)
}

/**
 * with函数是run的辩题，他们的行为都是一样的，但是with的调用方式不通，调用with时需要值参作为其第一个参数传入
 */
fun standardOfWithUse() {
    val str = "The people's Republic of China"
    with(str) {
        length >= 10
    }.run(::print)
}

/**
 * takeif需要判断lambda中提供的条件表达式，给出true或false，如果判断结果为true，则返回接受者对象，否则返回null，
 * 如果需要某个条件是否满足，再决定是否可以赋值或者做其他执行任务，则takeif就可以去实现。
 */
fun standardOfTakeifUse() {
    //使用takeif
    File("/Users/WuJinLi/Desktop/test.txt").takeIf {
        it.exists() && it.canRead()
    }?.readText().run(::print)

    //不使用takeif
//    var file = File("/Users/WuJinLi/Desktop/test.txt")
//    val fileContent: String? = if (file.exists() && file.canRead()) {
//        file.readText()
//    } else {
//        null
//    }
//    print(fileContent)
}

/**
 * takeunless:只有判断条件返回false时，才返回原始接收对象
 */
fun standardOfTakeUnlessUse() {
    File("/Users/WuJinLi/Desktop/test.txt").takeUnless {
        it.isHidden
    }?.readText().run(::print)
}


private class Stud(var name: String, var age: Int) {
    override fun toString(): String {
        return "[name:$name,age:$age]"
    }
}

fun isTooLong(str: String) = str.length > 10
fun showMessage(isToolLong: Boolean): String {
    return if (isToolLong) {
        "str is too long ."
    } else {
        "please rename."
    }
}
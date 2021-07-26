@file:JvmName("Hero")

package classandkotlin

import java.util.*

fun showInfoFromKotlin() = "this is a fun by kotlin"

val getInfoAboutFun = { info: String ->
    println(
        "detail info: ${
            info.lowercase()
                .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }"
    )
}

/**
 * @JvmOverloads注解协助产生kotlin函数重载版本，设计一个可能会暴露给java用户使用的API,记得使用@JvmOverloads
 */
@JvmOverloads
fun handOverFood(leftHand: String = "apple", rightHand: String = "beer") {
    println("Mu........ this hero left hand is $leftHand,rightHand is $rightHand")
}

/**
 * koltin代码调用java代码
 */
fun main() {
    var gun = Gun("AK 47")

    gun.name = "awm"

    println(gun.showInfo())
}


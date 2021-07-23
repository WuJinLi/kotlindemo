@file:JvmName("Hero")

package classandkotlin

fun showInfoFromKotlin() = "this is a fun by kotlin"


/**
 * koltin代码调用java代码
 */
fun main() {
    var gun = Gun("AK 47")

    gun.name = "awm"

    println(gun.showInfo())
}
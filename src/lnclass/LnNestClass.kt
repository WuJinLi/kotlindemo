package lnclass

import lnclass.Player.Equipment


/**
 * 嵌套类（一个类嵌套在另一类中的类）
 *
 * 如果一个类只对另一个类起作用，那么将其潜入到该类中并使这两个类保持一起，则使用嵌套类
 *
 * 嵌套类初始化时使用外层类名调用当前初始化类构造函数实现内部类初始化
 */
fun main() {
    Equipment("AK 47").show()
    Player().battle()

    Player1("M4").show()
}


class Player {
    open class Equipment(var name: String) {
        open fun show() = println("equipment:$name")
    }

    fun battle() = println("battle")
}

class Player1(name: String) : Equipment(name) {
    override fun show() = println("equipment:$name")
}
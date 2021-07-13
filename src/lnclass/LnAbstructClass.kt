package lnclass

fun main() {
    AK47(120).apply {
        println(doString())
        println(pullTrigger())
    }
}


abstract class Gun(range: Int) {
    abstract fun pullTrigger(): String

    open fun doString(): String {
        return "this is a abstruct class for Gun"
    }
}

class AK47(var range: Int) : Gun(range) {
    override fun pullTrigger(): String {
        return "AK 47 射程为${range}米"
    }

    override fun doString(): String {
        return super.doString()
    }
}
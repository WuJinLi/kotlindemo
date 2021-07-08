import java.util.*
import kotlin.math.absoluteValue

fun main() {
    var p = Player("Rose", -12, true)

    p.age = -20
    println(p.age)
}


class Player(_name: String, _age: Int, _isNormal: Boolean) {
    lateinit var equipment: String

    var name = _name
        get() = field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        set(value) {
            field = value.trim()
        }


    var age = _age
        get() = field.absoluteValue
        set(value) {
            field = value.absoluteValue
        }

    var isNormal = _isNormal

    fun ready() {
        equipment = "AK 47"
    }

    fun bettle() {
        if (::equipment.isInitialized) {
            println(equipment)
        }
    }
}


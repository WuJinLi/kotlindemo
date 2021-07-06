import kotlin.math.roundToInt

fun main() {
    var strDoubleNu = "8.99"

    //抛异常 字符串转数字类型
//    var convertToInt = strDoubleNu.toInt()
//    var convertToInt = strDoubleNu.toIntOrNull() ?: 0
//    var convertToDouble = strDoubleNu.toDoubleOrNull() ?: 0.00
//    var convertToFloat = strDoubleNu.toFloatOrNull() ?: 0.0
//    println(convertToFloat)

    //数字类型之间的转换
//    println("int to long：${193.toLong()}")
//    println("int to float：${193.toFloat()}")
//    println("int to double：${193.toDouble()}")

//    println("float to byte：${18.9.toInt().toByte()}")
//    println("float to int：${18.9.toInt()}")
//    println("float to double：${18.9.toDouble()}")
//    println("float to long：${18.9.toLong()}")

//    println("double to byte：${18.99.toInt().toByte()}")
//    println("double to int：${18.99.toInt()}")
//    println("double to int：${18.99.roundToInt()}")
//    println("double to float：${18.99.toFloat()}")
//    println("double to long：${18.99.toLong()}")

    println("%.2f".format(123.567895))
}
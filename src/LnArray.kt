fun main() {
    createArray()
}

/**
 * 数组的创建
 * 数组类型->创建函数
 * IntArray->intArrayOf
 * DoubleArray->doubleArrayOf
 * LongArray->longArrayOf
 * ShortArray->showtArrayOf
 * ByteArray->byteArrayOf
 * FloatArray->floatArrayOf
 * BooleanArray->booleanArrayOf
 * Array->arrayOf
 */
fun createArray() {
    val intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val intArray1 = listOf<Int>(1, 2, 4, 5, 6, 7, 8).toIntArray()

    print("intArray")
    intArray.forEach {
        print(" ")
        print(it)
    }
    println()
    print("intArray1")
    intArray1.forEach {
        print(" ")
        print(it)
    }
}

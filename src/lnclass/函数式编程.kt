package lnclass

/**
 * 函数式应用场景由三大函数构成：transform变换、filter过滤、combine合并
 *
 * transform：常用函数map、flatMap
 */


fun main() {
//    transformOfMap()
//    transformOfFlatMap()
//    filterTest1()
//    filterTest2()
//    filterTest3()
//    zipTest()
//    foldTest()

    var result = (0..5000).filter { it.isPrime() }.take(1000)

    println(result)
}

/***********************************转换*********************************/
/**
 * map:遍历接受者集合，让变换器函数作用域集合里的每一个元素，返回结果是包含已修改元素的集合，会做为链上下一个函数的输入
 */
fun transformOfMap() {
    var nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    var result = nums
        .map { number ->
            number * 10
        }
        .map { number ->
            number / 2
        }
    println("nums:$nums")
    println("result:$result")
}


/**
 * flatMap 函数操作的是集合中的集合，将其中多个集合的元素合并返回一个包含所有元素的单一集合
 */
fun transformOfFlatMap() {
    var nums = listOf(listOf(1, 2, 3, 4, 5, 6), listOf(6, 7, 8, 9, 11))
    var result = nums.flatMap { it }

    println(result)
}

/***********************************过滤*********************************/
fun filterTest1() {
    var result = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9).filter { num ->
        num % 2 == 0
    }
    println(result)
}

fun filterTest2() {
    val items = listOf(
        listOf("red apple", "green apple", "blue apple"),
        listOf("red fish", "blue fish"),
        listOf("red flower", "yellow flower")
    ).flatMap {
        it.filter {
            it.contains("red")
        }
    }
    println(items)
}

/**
 * 找素数
 */
fun filterTest3() {
    println(listOf(7, 3, 4, 5, 6, 9, 11, 22, 33, 56, 78)
        .filter { number ->
            (2 until number)
                .map { number % it }
                .none { it == 0 }
        })
}

/***********************************合并*********************************/
/**
 * zip合并函数合并两个集合，返回一个包含键值对的新集合
 */
fun zipTest() {
//    val employees = listOf("Jack", "Jason", "Tommy", "Rose")
    val employees = listOf("Jack", "Jason")
    val shirtSize = listOf("large", "x-large", "medium")

    val result = (employees zip shirtSize).toMap()

    println(result)
}


/**
 * fold:函数接收一个出事累加器，随后根据匿名函数的结果更新
 *
 *
 * 实现场景：
 * 一个int类型集合，将其集合每个元素*3后计算集合所有元素的总和
 */
fun foldTest() {
    var result = listOf(1, 2, 3, 4, 5).fold(0) { accumulator, number ->
        accumulator + (number * 3)
    }

    println(result)
}

fun Int.isPrime(): Boolean {
    (2 until this).map {
        if (this % it == 0) {
            return false
        }
    }
    return true
}



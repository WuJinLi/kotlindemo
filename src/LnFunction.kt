fun main() {

//    val a = arrayOf(6, 5, 4, 3, 2, 1)
//
//    asList(1, 2, 3, 4, 5, 6, 7, 8, *a).forEach { elem ->
//        print(elem)
//        print(" ")
//    }
//    print(2 add 2)

//    print(lock("zhangsan", "lisi", ::getResult))
//    print(lock("zhangsan", "lisi", { str1: String, str2: String -> "result is {$str1 , $str2}" }))
    print(lock("zhangsan", "lisi") { str1: String, str2: String -> "result is {$str1 , $str2}" })
    //调用方法1：
//    print(showBorde("洗衣机",::showInfo))
    //调用方法2：
//    print(showBorde("洗衣机") { str, h ->
//        val currentYear = "2021"
//        "$currentYear 双十一活动，$str 大降价倒计时 $h 小时"
//    })

    var info: (s: String, hour: Int) -> String = { s, h ->
        val currentYear = "2021"
        "$currentYear 双十一活动，$s 大降价倒计时 $h 小时"
    }
    print(showBorde("洗衣机", info))
}

/**
 * vararg 可变参数
 */
fun <T> asList(vararg ts: T): List<T> {
    var result = ArrayList<T>()

    for (t in ts) {
        result.add(t)
    }
    return result
}

infix fun Int.add(na: Int) = this + na


fun getResult(params1: String, params2: String): String = "result is {$params1 , $params2}"


fun lock(p1: String, p2: String, method: (str1: String, str2: String) -> String): String {
    return method(p1, p2)
}

fun showInfo(goodName: String, hour: Int): String {
    val currentYear = "2021"
    return "$currentYear 双十一活动，$goodName 大降价倒计时 $hour 小时"
}

fun showBorde(goodName: String, method: (str: String, h: Int) -> String): String {
    var hour = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8).shuffled().lastIndex
    return method(goodName, hour)
}



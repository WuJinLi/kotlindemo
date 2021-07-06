const val NAME = "jack' is good boy"
const val NAMES = "java,android,oc,kotlin,flutter"
fun main() {
    //字符串的截取 常规写法
//    println(NAME.substring(0,NAME.indexOf("\'")))

    //字符串的截取  支持range
//    println(NAME.substring(0 until NAME.indexOf("\'")))

    //split字符串分割 返回参数为集合
//    NAMES.split(",").forEach { ele-> println(ele) }
//    val (first: kotlin.String, secound: kotlin.String, thrid: kotlin.String, fourth: kotlin.String, fifth: kotlin.String) = NAMES.split(
//        ","
//    )
//    println("$first , $secound ,$thrid ,$fourth ,$fifth")

    var str = "The people's Republic of China"
    //replace
//    var str1 = str.replace(Regex("[aeiou]")){
//        when(it.value){
//            "a" -> "8"
//            "e" -> "4"
//            "i" -> "6"
//            "o" -> "0"
//            "u" -> "3"
//            else -> it.value
//
//        }
//    }
//    println(str)
//    println(str1)

    //字符串的比较 ==比较字符串的内容，===比较的是字符串的地址
//    var strOfCompare1 = "jack"
//    var strOfCompare2 = "jack"
//    println("strOfCompare1==strOfCompare2:${strOfCompare1 == strOfCompare2}")
//    println("strOfCompare1===strOfCompare2:${strOfCompare1 === strOfCompare2}")

    var newStrOfCompare1 = "Jack"
    var newStrOfCompare2 = "jack"
//    println("newStrOfCompare1==newStrOfCompare2:${newStrOfCompare1 == newStrOfCompare2.capitalize()}")
//    println("newStrOfCompare1===newStrOfCompare2:${newStrOfCompare1 === newStrOfCompare2.capitalize()}")
    
    println(newStrOfCompare2.replaceFirstChar {
        if (it.isLowerCase()) {
//            it.toUpperCase()
            it.uppercaseChar()
        } else {
            it
        }
    })
}
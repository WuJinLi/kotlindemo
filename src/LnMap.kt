fun main() {
//    createMap()
//    getMapValue()
//    traversalMap()
    getMutableMapValue()
}


/**
 * 创建map的方法 mapOf
 * 创建mutableMap
 */
fun createMap() {
    val map = mapOf("name" to "Rose", "age" to 12, "address" to "Beijing")
    println("map:$map")

    val map2 = mapOf(Pair("name", "Tom"), Pair("age", 13), Pair("address", "ShangHai"))
    println("map2$map2")

    var mMap = mutableMapOf(Pair("name", "Tom"), Pair("age", 13), Pair("address", "ShangHai"))
}


/**
 * 获取map的值
 * 1.[]取值运算符，读取对应键的值，键不存在则返回null
 * 2.getValue，读取键对应的值，如果键不存在则抛出异常
 * 3.getOrElse:读取键对应的值，或使用匿名函数返回默认值
 * 4.getOrDefault：读取键对应值，或者返回默认值
 */
fun getMapValue() {
    val map2 = mapOf(Pair("name", "Tom"), Pair("age", 13), Pair("address", "ShangHai"), Pair("sex", "Man"))
//    println("name is ${map2["name"]}")
//    println("age is ${map2.getValue("age")}")
//    println("age1 is ${map2.getValue("age1")}")
//    println("address is ${map2.getOrElse("address") { "unknow" }}")
//    println("address1 is ${map2.getOrElse("address1") { "unknow" }}")
//    println("sex is ${map2.getOrDefault("sex", defaultValue = "unknown")}")
    println("sex1 is ${map2.getOrDefault("sex1", defaultValue = "unknown")}")
}

/**
 * 获取当前mutableMap的值
 */
fun getMutableMapValue() {
    var muMap = mutableMapOf(Pair("zhangsan", 12), "lisi" to 22, Pair("wangwu", 20))
//    println(muMap)
//    println("get method:${muMap.get("zhangsan")}")
//    println("getOrDefault method:${muMap.getOrDefault("zhaoliu", 0)}")
//    println("getOrPut methdod: ${muMap.getOrPut("tom") { 20 }}")
//    println(muMap)

//    println("keys : ${muMap.keys}")
//    println("values : ${muMap.values}")
//    println("entries : ${muMap.entries}")

//    println(muMap.getOrElse("zhangsan") { 20 })
}

/**
 * map的遍历
 */
fun traversalMap() {
    val map2 = mapOf(Pair("name", "Tom"), Pair("age", 13), Pair("address", "ShangHai"), Pair("sex", "Man"))

    // 遍历方法1
    map2.forEach { t, u ->
        println("t,u->$t ,$u")
    }

    // 遍历方法2
    map2.forEach {
        println("key,value -> ${it.key} , ${it.value}")
    }

    // 遍历方法3
    map2.forEach({
        println("key,value -> ${it.key} , ${it.value}")
    })
    // 遍历方法4
    map2.forEach { (key: String, value: Any) ->
        println(println("key,value -> ${key} , ${value}"))
    }

}
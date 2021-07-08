fun main() {
//    createSet()
    exChanged()
}


/**
 * set集合创建
 * 1：setOf  不可变
 * 2：mutableSetOf 可变
 */
fun createSet() {
//    val set = setOf("java", "android", "ios", "ios")
//    println(set.size)

//    set.forEach {
//        println(it)
//    }

//    println(set.elementAt(3))
//    println(set)

    var mSet = mutableSetOf("java")
    val addList = listOf<String>("java", "kotlin", "ruby", "flutter")
    val addSet = setOf("java", "kotlin", "ruby", "golang")
    //1:增加 删除
    //+=添加元素
//    mSet += "android"
//    mSet += "flutter"

    //-=移除元素
//    mSet -= "android"
    //2:增加 删除
    mSet.add("android")
    mSet.add("flutter")

    mSet.removeIf({ it == "flutter" })

    mSet.apply {
        addAll(addList)
        addAll(addSet)
    }

    println(mSet)
}

/**
 * set与mutableSet list mutableList之间的切换
 */
fun exChanged() {
    var set = setOf("java", "python", "kotlin", "c", "c++", "c#")

//    set+="javascrtpt"
//    println(set)
//    set-="javascrtpt"
//    println(set)

    var mSet = set.toMutableSet()
//    mSet.add()
//    mSet.addAll()
//    mSet.remove()

    var list = set.toList()
//    list += "javascrtpt"
//    println(list)
//    list -= "javascrtpt"
//    println(list)

    var mList = set.toMutableList()
    mList.addAll(listOf("java", "python", "kotlin", "c", "c++", "c#"))
//    mList.addAll()
//    mList.removeAt()
//    println("mList:$mList")
//    print("mList->set:${mList.toMutableSet()}")

    //kotlin提供了快捷转换的函数distinct 实现去重
    println(mList.distinct())
}
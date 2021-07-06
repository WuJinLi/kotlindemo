/**
 * 集合中涉及到不可变列表(list)和可变列表(mutableListOf)
 */

fun main() {
    listCreate()
//    mutableListCreate()
//    listChangeToMutableList()
//    mutatorFunForMutableList()
//    itertorList()
//    jieGouForList()
}


/**
 * list创建：
 * listOf<T>()·
 * list取值：
 * getOrElse 安全索引取值函数，需要两个参数，第一个参数是索引值，第二个则是提供默认的值得lambda表达式，如果索引不存在，可用来代替异常
 * getOrNull 安全索引取值函数，如果索引不存在则会返回null，这样可以结合操作符（？：）进行为空是的处理
 */
fun listCreate() {
    val list = listOf<String>("java", "kotlin", "golong", "javascript")
    println("get element by list[]:${list[1]}")
    println("get element by list.getOrElse():${list.getOrElse(list.size) { "unknow" }}")
    println("get element by getOrNull():${list.getOrNull(2) ?: "unknow"}")
}

/**
 * mutableList创建：
 */
fun mutableListCreate() {
    //创建
    var list = mutableListOf<String>("java", "kotlin", "golong", "javascript")
    val list1 = listOf<String>("Ruby", "C")
    //添加元素
    list.add(4, "dart")
    list.add("flutter")
//    list.addAll(list1)
    list.addAll(0, list1)

    //修改元素
    list.set(4, "C++")

    //删除元素
//    list.removeAt(4)
    list.remove("flutter")

    list.forEach {
        println(it)
    }
}

fun listChangeToMutableList() {
    val list = listOf<String>("java", "kotlin", "golong", "javascript")
    var mList = mutableListOf<String>("Ruby", "C", "dart", "flutter")

    //list->mutableList
    list.toMutableList().apply {
        add(this.size, "change to mutable add new element")
        add("change to mutable add new element")
    }.forEach {
        println(it)
    }

    //mutableList->list
    mList.toList().apply {
        println(size)
    }
}

/**
 * mutator函数
 * += 相当于 add
 * -= 相当于 remove
 * removeIf{}跟lambda表达式
 */
fun mutatorFunForMutableList() {
    var mList = mutableListOf<String>("Ruby", "C", "dart", "flutter")
    println(mList)
    mList += "Java"
    println(mList)
//    mList -= "Java"
//    println(mList)

    mList.removeIf {
        it.contains("dart")
    }
    println(mList)
}


/**
 * 遍历list方法
 */
fun itertorList() {
    var mList = mutableListOf<String>("Ruby", "C", "dart", "flutter")
    //1:for
//    for (ele in mList) {
//        println(ele)
//    }
//
//    //2:forEach
//    mList.forEach {
//        println(it)
//    }

    //3:forEachIndexed
    //实现1
//    mList.forEachIndexed { index, s ->
//        println("index, s -> $index , $s")
//    }

    //实现2
//    mList.forEachIndexed(fun(index: Int, ele: String) {
//        println("index, s -> $index , $ele")
//    })

    //实现3
//    mList.forEachIndexed(fun(index: Int, ele: String) = println("index, s -> $index , $ele"))

    //实现4
//    val f = fun(index: Int, ele: String) {
//        println("index, s -> $index , $ele")
//    }
//    mList.forEachIndexed(f)
}

/**
 * 在日常操作中会涉及到去出list中的元素赋值给变量，在赋值变量时涉及到有些元素无需赋值变量，则使用_(下划线)来实现
 */
fun jieGouForList() {
    var mList = mutableListOf<String>("C", "dart", "flutter")

    val (firstEle: kotlin.String, _: kotlin.String) = mList
    println("first element from mList is : ${firstEle}")
}
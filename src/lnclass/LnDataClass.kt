package lnclass


/**
 * 数据类
 * 1：专门设计用来存储数据的类
 * 2：数据类提供了toString的个性实现
 * 3：==默认情况下，比较的就是对象的他们的引用，数据类提供了equals和hashCode的个性化实现
 * 4：copy方法，快速实现的新对象的创建（针对使用次构造函数中对属性赋值有坑）
 * 5：支持解构声明
 */
fun main() {
    //数据类的声明初始化
//    println(Coordinate(12,3))

    //数据类重写equals和hashCode，及==比较的是两个对象的内容
//    println(Coordinate(12,3).equals(Coordinate(12,3)))
//    println(Coordinate(12, 3) == Coordinate(12, 3))

    //解构声明
//    val (x: kotlin.Int, y: kotlin.Int) = Coordinate(x = 12, y = 11)
//    println("x:$x")
//    println("y:$y")

    //普通类实现解构
//    val (experience, level) = PlayerScore(12, 1)
//    println("experience:$experience")
//    println("level:$level")

    //运算符的重载
    var coordinate1 = Coordinate(12, 24)
    var coordinate2 = Coordinate(12, 24)
    println(coordinate1 + coordinate2)
}


/**
 * 实现运算符的重载
 *
 * 常见操作符
 * +：plue   把一个对象添加到另一个对象
 * +=：plusAssign    把一个对象添加到另一个对象 然后将结果赋值给第一个对象
 * ==：equals    如果两个对象相等则返回true，否则返回false
 * >：compareTo  如果左边大于右边对象，则返回true，否则false
 * []：get   返回集合中指定位置元素
 * ..：rangeTo   创建range对象
 * in：contains  如果对象包含在即合理，则返回true
 */
data class Coordinate(var x: Int, var y: Int) {
    val isInBounds = x > 0 && y > 0

    operator fun plus(other: Coordinate) = Coordinate(x + other.x, y + other.y)
}


/**
 * 正常类实现解构声明的方法(使用component组建函数对属性进行初始化)
 */
class PlayerScore(val experience: Int, val level: Int) {
    operator fun component1() = experience
    operator fun component2() = level
}
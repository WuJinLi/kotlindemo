package lnclass


/**
 * 枚举类
 */
fun main() {
    println(Direction.SOUTH.name)
//    println(toChinese(Direction.SOUTH))
//    println(Direction1.EAST.updateCoordinate(Coordinate(12, 12)))
}

fun toChinese(direction: Direction): String {
    return when (direction) {
        Direction.EAST -> "东方"
        Direction.WEST -> "西方"
        Direction.NORTH -> "北方"
        Direction.SOUTH -> "南方"
    }
}

/**
 * 简单的枚举类
 */
enum class Direction {
    EAST,
    WEST,
    NORTH,
    SOUTH
}


/**
 * 枚举类中也可以存在相关的属性、函数
 */
enum class Direction1(val coordinate: Coordinate) {
    EAST(Coordinate(-1, 0)),
    WEST(Coordinate(1, 0)),
    NORTH(Coordinate(0, 1)),
    SOUTH(Coordinate(0, -1));

    fun updateCoordinate(other: Coordinate) =
        Coordinate(
            coordinate.x + other.x,
            coordinate.y + other.y
        )
}

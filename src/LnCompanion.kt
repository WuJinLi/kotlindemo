fun main(args: Array<String>) {
    println(StringUtils.isEmpty("1"))
    println(StringUtils.flag)
}


/**
 *  伴生对象：必须声明在某个类中。
 *  每个类可以对应一个半生对象，伴生对象的成员全局独一份，伴生对象类似java中的静态成员。
 *   @JvmField 和 @JvmStatic 两个注解。@JvmField 使用在属性上，@JvmStatic 使用在方法上
 */
class StringUtils {
    companion object {
        @JvmStatic
        fun isEmpty(str: String): Boolean {
            return "".equals(str)
        }

        @JvmField
        val flag = false
        val flag1 = true

        fun length(str: String): Int {
            if ("".equals(str) || str == null) {
                return 0
            } else {
                return str.length
            }
        }
    }
}
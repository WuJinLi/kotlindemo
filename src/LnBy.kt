import kotlin.properties.Delegates
import kotlin.reflect.KProperty

val lazyValue:String by lazy {
    println("by lazy init")
    "lazyValue"
}

fun main() {
//    var str: String by Delegates.observable("",
//        { property: KProperty<*>, oldValue: String, newValue: String -> println("${property.name}->${oldValue}-->${newValue}") })
//
//    str = "zhangsna"
//    str = "wangwu"

//    var user = User()
//    user.init("wangwu")
//    print(user.name)

//    val user = UserX(mapOf(
//        "name" to "John Doe",
//        "age"  to 123
//    ))
//    println("name = ${user.name}, age = ${user.age}")

    println(lazyValue)
    println(lazyValue)
}

class User{
    var name:String by Delegates.notNull()

    fun init(str:String){
        this.name=str
    }
}

class UserX(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}





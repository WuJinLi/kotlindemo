package lnclass


/**
 * 范型类、范型函数
 */
fun main() {
    val magicBox1 = MagicBox(Boy("Rose", 12))
    val magicBox2 = MagicBox(Dog(20))

//    println("magicBox1 attrbute is ${magicBox1.subject}")
//    println("magicBox2 attrbute is ${magicBox2.subject}")
//    println(magicBox1.fetch())
//    println(magicBox2.fetch())
//    var ma1 = magicBox1.fetch {
//        if (it is Boy) {
//            return@fetch Man(it.name, it.age.plus(20))
//        } else {
//            return@fetch BigDog(it.age.plus(10))
//        }
//    }
//    println(ma1)

    var mac1 = MachineInfo(Bicycle("bicycle", "交通工具"))
    var mac2 = MachineInfo(Computer("computer", "上网工具"))

    println("mac1:${mac1.fetch() ?: "无相关信息"}")
    println("mac2:${mac2.fetch() ?: "无相关信息"}")
}

/**********************************范型声明、范型函数**************************************/
class MagicBox<T>(item: T) {
    val subject = item
    var avaiable = true


    fun fetch(): T? {
        return subject.takeIf { avaiable }
    }

    //多范型类型函数
    fun <R> fetch(subjectModeFunction: (T) -> R): R? {
        return subjectModeFunction(subject).takeIf { avaiable }
    }
}

class Boy(var name: String, var age: Int) {
    override fun toString(): String {
        return "Boy[name=$name ,age=$age]"
    }
}

class Dog(var height: Int) {
    override fun toString(): String {
        return "Dog[height=$height]"
    }
}

class BigDog(var height: Int) {
    override fun toString(): String {
        return "BigDog[height=$height]"
    }
}

class Man(var name: String, var age: Int) {
    override fun toString(): String {
        return "Man[name=$name ,age=$age]"
    }
}

/**********************************范型类型的约束**************************************/

open class Machine(var function: String)

class Bicycle(var type: String, function: String) : Machine(function) {
    override fun toString(): String {
        return "Bicycle[type=$type ,function=$function]"
    }
}

class Computer(var type: String, function: String) : Machine(function) {
    override fun toString(): String {
        return "Computer[type=$type ,function=$function]"
    }
}

class MachineInfo<T : Machine>(machine: T) {

    var subject = machine

    fun fetch(): T? {
        return subject.takeIf { subject is Bicycle }
    }
}


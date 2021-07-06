fun main() {
    print(Box(12).getResult())
}



class Box<T>(t:T){
    private var value = t

    fun getResult():T{
        return value
    }
}
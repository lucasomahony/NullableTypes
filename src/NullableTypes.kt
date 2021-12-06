fun greet(name: String?) : String {
    val x = name ?: "hello world"
    return x
}

fun main(args: Array<String>){
    println("Please type your name")
    val name = readLine()

    if (name != null) {
        var greeting = greet(name)
        println(greeting)
    }

    val x = greet(null)

    println(x)
}

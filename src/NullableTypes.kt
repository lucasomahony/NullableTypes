fun greet(name: String) : String {
    return "hello $name"
}

fun main(args: Array<String>){
    println("Please type your name")
    val name = readLine()

    if (name != null) {
        var greeting = greet(name)
        println(greeting)
    }
}


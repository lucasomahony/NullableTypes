fun greet(name: String?) : String {
    var x = name!!
    return "hello $x"
}

fun main(args: Array<String>){
    //println("Please type your name")
    //val name = readLine()
    //val greeting = greet(name)
    //println(greeting)

    val greeting2 = greet(null)
    println(greeting2)
}
package FunctionExample

fun main(args:Array<String>){
    var add= sum_parameterized(10,20)
    print("Sum is : "+add)
}

fun sum_parameterized(a:Int,b:Int):Int{
    val add=a+b
    return add
}
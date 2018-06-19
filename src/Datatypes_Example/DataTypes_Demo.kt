package Datatypes_Example

fun main(args:Array<String>)
{
    //In Val We can't reassigned value and var reassigned value

    var a:Int=10
    var b:Int=20
    var c:Int=a+b
    print("Sum is : "+c)

    //Array
    var ar:IntArray= intArrayOf(1,2,3,4,5)
    for(i in 0..ar.size-1)
    print("\nArray Value is : "+ar[i])
}
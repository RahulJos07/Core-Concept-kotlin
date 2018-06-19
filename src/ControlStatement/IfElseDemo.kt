package ControlStatement

fun main(args:Array<String>)
{
    var a:Int=10
    var b:Int=20
    var max:Int
    print("Value of A is :"+a)
    print("\nValue of B is :"+b)
    if(a>b)
    {
        print("\nA is Greater than B")
        max=a
    }
    else
    {
        print("\nB is Greater then A")
        max=b
    }
    print("\nMaximum Value is :"+max)
}
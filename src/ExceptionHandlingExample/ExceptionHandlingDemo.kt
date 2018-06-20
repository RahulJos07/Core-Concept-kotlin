package ExceptionHandlingExample

fun main(args:Array<String>)
{
    try {
        var a=10/0;
    }
    catch(e:ArithmeticException)
    {
        print(e)
    }
    finally {
        print("\nAlways Executed")
    }
}
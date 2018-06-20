package OopsConceptDemo

open class A
{
    fun class_a()
    {
        print("Class A Called")
    }
}
class B: A()
{
    fun class_b()
    {
        print("\nClass B Called")
    }
}
fun main(args:Array<String>)
{
    var b=B()
    b.class_a()
    b.class_b()
}
package OopsConceptDemo

class ClassObjDemo{
    private var name:String="Rahul"
    fun print()
    {
        print("Name : "+name)
    }
}
fun main(args:Array<String>)
{
    val claobj=ClassObjDemo()
    claobj.print()
}
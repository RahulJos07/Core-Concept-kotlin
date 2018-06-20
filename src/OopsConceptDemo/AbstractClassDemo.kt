package OopsConceptDemo

abstract class Ab
{
    abstract fun show()
}
class Demo:Ab()
{
    override fun show() {
        print("Show Method")
    }
}
fun main(args:Array<String>)
{
    var a=Demo()
    a.show()
}
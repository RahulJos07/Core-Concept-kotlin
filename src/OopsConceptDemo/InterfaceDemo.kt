package OopsConceptDemo

interface i1
{
    fun i_one()
    {
        print("Interface One")
    }
}
interface i2
{
    fun i_two()
    {
        print("\nInterface Two")
    }
}
class DemoInterface:i1,i2
{

}
fun main(args:Array<String>)
{
    var demoInterface=DemoInterface()
    demoInterface.i_one()
    demoInterface.i_two()
}
package variables

object  VariablesEx {
  def main(args: Array[String]): Unit = {
    /*
    ==>We can Declare Variable in Scala using two keywords var,val
    ==>val is immutable and var is mutable
    */
    val b:Byte=12
    val s:Short=123
    val i:Int=1
    val l:Long=12344
    val f:Float=123.5f
    val d:Double=234.4
    val c:Char='c'
    val str:String="Foo"
    val boolean: Boolean = true
    print(b+" "+" "+s+" "+i+" "+l+" "+f+" "+d+" "+c+" "+str+" "+boolean)
  }
}

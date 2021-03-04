package functions

object FunctionExample {

  //Syntax for function in scala
  // def <functionName>(<parameters>):resultType={ function logic}
  def main(args: Array[String]): Unit = {
    FunctionExample.sayHello("World")
  }
  def sayHello(s:String):Unit={
    println(s"Hello ${s}")
  }
}

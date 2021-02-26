package conditionalstatements

object WhileLoopExample {
  def main(args: Array[String]): Unit = {
    println("Enter a Number :")
    var a:Int=scala.io.StdIn.readInt();
    while (a<100){
      println("hai...."+a);
      a=a+1
    }
  }
}

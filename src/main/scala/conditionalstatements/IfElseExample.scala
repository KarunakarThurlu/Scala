package conditionalstatements

object IfElseExample {
  def main(args: Array[String]): Unit = {
    println("Enter a number :")
    var number:Int=scala.io.StdIn.readInt();
    if(number%2==0)
      println(number+" is even number");
    else
      println(number+" is odd number")
  }
}

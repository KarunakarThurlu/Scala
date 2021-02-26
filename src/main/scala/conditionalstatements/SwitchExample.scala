package conditionalstatements

object SwitchExample {
  def main(args: Array[String]): Unit = {
    var c:Char='K';
    var m= c match {
      case 'A' => "A char"
      case 'B' => "B char"
      case 'C' => "c char"
      case  _  =>"none match"
    }
    println(c);
  }
}

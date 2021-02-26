package collections

object ListEx {
  def main(args: Array[String]): Unit = {
    val l:List[Int] = List(1,2,3,4,5,6,7,8,9)
    val s:List[String] = List("aaa","bbb","ccc","ddd")

    //Iterating List elements using for loop
    for(f<-l){
      println(f);
    }

    s.foreach(j=>println(j));
  }
}

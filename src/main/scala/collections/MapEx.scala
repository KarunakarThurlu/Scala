package collections

object MapEx {
  def main(args: Array[String]): Unit = {
    val m:Map[Int,String]=Map((1,"Karun"),(2,"Varun"),(3,"meanonn"))
    var k:Map[String,String]=Map(("Oracle"->"Java"),("Apache"->"Kafka"),("Python"->"OpenSource"))
    for (k<-m){
      println(k._1+" "+k._2)
    }
    k.foreach(j=>println(j._1+" "+j._2));
  }
}

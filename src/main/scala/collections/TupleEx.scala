package collections

object TupleEx {
  /*
    1). Tuple is not a coletion
    2). We Can't Iterate Tuple

   */
  def main(args: Array[String]): Unit = {

    //Accessing Elements from Tuple
    var t1=Tuple4(2,3,4,5);
    println(t1._2)

    //Tuple Supports Utmost 22 Elements
    var t2=Tuple22(34,45,5,6,7,8,90,9,34,45,5,6,7,8,90,9,34,45,5,6,7,8);
    println(t2)

    //Finding Info About Tuple
    var t3=t2.copy();
    println(t3)

    //We can Store Heterogeneous values in Tuple
    var t4=Tuple4("Karun",25,'T',true);
    println(t4);
  }
}

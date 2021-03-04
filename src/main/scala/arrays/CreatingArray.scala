package arrays

object CreatingArray {
  def main(args: Array[String]): Unit = {
    //(i). 1st Way
    var array1=new Array[Int](10)

    //(ii). 2nd way
    var array2=new Array[Any](10)

    //(iii). 3rd Way
    var array:Array[Int]=new Array[Int](5)

    println(array.mkString(","))

    var i:Int=1
    for(e<- 0 to array.size-1){
     array.update(e,i)
      i=i+1
    }
    println(array.mkString(","))
  }
}

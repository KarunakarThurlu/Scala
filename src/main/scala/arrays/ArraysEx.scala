package arrays

object ArraysEx {
  def main(args: Array[String]): Unit = {
    var a1:Array[String]=Array("Redis","Durby","Postgre","Mongo","clickhouse")
    var a2:Array[Int]=Array(1,2,3,4,5,6,7)
    var a8:Array[Any]=Array(1,"foo",'J',true,2.0,56.78f)
    a8.foreach(k=>print(k+" "))

    //Find Size of Array Elements
    println(a2.size)

    //Getting Specific index element of array
    a2(2)

    //Looping Array elements
    a2.foreach(u=>println(u))

    //Updating Array Element
    a2.update(2,20)
    var a3:Array[Float]=Array(23.34f,34.5f,56.6f,67.6f)

    println(a1.mkString(","))
    println(a2.mkString(","))
    println(a3.mkString(","))

  }
}

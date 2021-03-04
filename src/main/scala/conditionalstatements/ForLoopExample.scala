package conditionalstatements

object ForLoopExample {
  def main(karun:Array[String]):Unit={

    for(i<- 1 to 10){
      println(i);
    }

    //For loop with expression
    var numbers:Seq[Int]=Seq(1,2,3,4,5)
    var doubledNumbers=for(i<-numbers) yield 2*i
    println(doubledNumbers)

    //For Loop with String expressions
    var names:List[String]=List("scala","java","spark","hadoop")
    var upper_case_names=for(name<-names) yield name.toUpperCase()
    println(upper_case_names)
  }
}

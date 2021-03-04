package classes

class Employee(var name:String,var email:String,var phoneNumber:Int){
  def employeeInfo():Unit={
    println(s"Name: ${name} Email: ${email} PhoneNumber: ${phoneNumber}")
  }
}



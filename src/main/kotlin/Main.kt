fun main(){
  naming("lucy",20,"Kenya")
    println(num1+num2)
    println(num3+num4)
    println(num4+num6)
    println(average(1,2,3,4,5))
var p =personRecords("Janet Tipanoi Shirin",18,"0710335095""tipanoijanet@gmail.com",50.5F,true or false)
}
//Create and invoke a function that takes in a users name, age, and nationality and prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and I am from Kenya” (2 points)
fun naming(name:String,age:Int,nationality:String){
    println("Hello,my $name ,I am $age old from $nationality")

}


 //Create and invoke a function that returns the sum of any given 4 numbers (3 points)
   var num1=16
   var num2=7


  var num3 = 210
  var num4 = 36



  var num5 = 30
  var num6 = 16



 //Create and invoke a function that given any 5 numbers, it returns their average
fun average(num1:Int,num2:Int,num3:Int,num4:Int,num5:Int):Int {


     var numbers = 5
     val sum = num1 + num2 + num3 + num4 + num5
     return sum / numbers

}


// You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
  fun personRecords(fullName:String,age:Int,phoneNumber:String,email:String,weight:Float,Citizen:Boolean){
      println("My name is${fullName},phoneNumber is ${phoneNumber},email is${email},I have${weight}kgs and I am a kenyan${Citizen}")
  }

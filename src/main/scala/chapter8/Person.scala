package chapter8

/**
  * Created by apple on 11/13/16.
  */
class Person(name: String, age: Int) {
  override def toString: String = "[" + name + "]" + ", [" + age + "]"
}

class Employee(name:String, age:Int, salary:Double) extends Person(name, age){

  override  def toString: String = super.toString + ", [" + salary + "]"
}

object Employee{

  def apply(name: String, age: Int, salary: Double): Employee = new Employee(name, age, salary)

}

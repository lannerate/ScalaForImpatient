package chapter8

import org.scalatest.FunSpec
import chapter8.Employee

/**
  * Created by apple on 11/13/16.
  */
class PersonSpec extends FunSpec{

  describe("Test Employee"){
    it("test toString() of Employee"){
      val employee = Employee("Mark",33,8900)
      assert("[Mark], [33], [8900.0]" == employee.toString)
    }
  }

}

import java.util.Date

class demoClass(val a:Int, val b:Int) {
  var x = a
  var y = b

  //Methods are defined within the class

  def addNumber() = {
    x + y
  }

  println(s"x= $x and y= $y")

  val z=addNumber()

  println(s"z =  ${z}")
}

object helloWorld {

  def main(args: Array[String]): Unit = {

    val demoOne = new demoClass(4556,567576)

  }


}

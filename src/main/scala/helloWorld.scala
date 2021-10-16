import java.util.Date

class Car {
  var topClassExtraCost = 0
  private var roadTax = 100

  //Methods are defined within the class

  def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax

}

object helloWorld {

  def main(args: Array[String]): Unit = {
    println("Hello world!!")

    var result = add(2, 5)
    println("Addition result is : " + result)

  }

  var bmw = new Car

  println(bmw.cost(45))

  //This is function
  def add(x: Int, y: Int) = {
    var z = x + y
    z
  }

}

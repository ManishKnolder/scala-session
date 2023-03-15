import scala.annotation.tailrec

object FactorialRecursion extends App {
  //factorial method is used to calculate the factorial of the passed number as parameter.
  @tailrec
  def factorial(number: Int, accumulator: Int): Int = {
    try {
      if (number.isNaN) throw new NumberFormatException
    }
    catch {
      case ex: NumberFormatException => {
        ex.getMessage
      }
    }
    if (number <= 1) accumulator
    else factorial(number - 1, accumulator * number)
  }

}

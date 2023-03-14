object FactorialRecursion extends App {
  //factorial method is used to calculate the factorial of the passed number as parameter.
  def factorial(number: Int, accumulator: Int): Int = {
    try {
      if (number < 0) throw new NumberFormatException
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

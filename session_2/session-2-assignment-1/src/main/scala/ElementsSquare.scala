object ElementsSquare extends App {

  //Square the element of list by pattern matching
  def squareListByPattern(list: List[Int]): List[Int] = {
    checkException(list)
    list match {
      case Nil => Nil
      case head :: tail => head * head :: squareListByPattern(tail)
    }
  }

  //Square the element of list by map
  def squareListByMap(list: List[Int]): List[Int] = {
    checkException(list)
    val squaredElement = list.map(element => element * element)
    squaredElement
  }

  //Method to check the exception
  def checkException(list: List[Int]) = {
    try {
      if (list.isEmpty) throw new ArithmeticException()
    }
    catch {
      case ex: ArithmeticException => ex.getMessage
    }
  }
}
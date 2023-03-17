
object SortingProgram extends App {
  //This method is used to sort the element using bubble Sort
  def bubbleSort(list: List[Int]): List[Int] = {
    try {
      if (list.isEmpty) throw new IllegalArgumentException()
    }
    catch {
      case ex: IllegalArgumentException => ex.getMessage
    }

    def sort(list: List[Int]): List[Int] = list match {
      case head :: headNext :: restElement if head > headNext => headNext :: sort(head :: restElement)
      case head :: restElement => head :: sort(restElement)
      case emmptyList => emmptyList
    }

    val sortedList: List[Int] = sort(list)
    if (sortedList == list) sortedList
    else bubbleSort(sortedList)
  }

  //This method is used to sort the element using selection Sort
  def selectionSort(list: List[Int]): List[Int] = {
    list match {
      case Nil => Nil
      case _ =>
        val min = list.min
        min :: selectionSort(list.filter(_ != min))
    }
  }
}


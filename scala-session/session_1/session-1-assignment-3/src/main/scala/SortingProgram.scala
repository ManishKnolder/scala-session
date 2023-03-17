
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
      case emptyList => emptyList
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

  //This method is used for insertion sort
  def insertionSort(list: List[Int]): List[Int] = {
    list match {
      case Nil => Nil
      case head :: tail => insert(head, insertionSort(tail))
    }
  }

  def insert(x: Int, arr: List[Int]): List[Int] = {
    arr match {
      case Nil => Nil
      case head :: tail => if (x <= head) x :: arr else head :: insert(x, tail)
    }
  }
}

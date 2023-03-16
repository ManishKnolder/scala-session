import org.scalatest.flatspec.AnyFlatSpec

class SortingProgramTest extends AnyFlatSpec {
  val obj = SortingProgram
  val list: List[Int] = List(3, 2, 5, 6, 7)

  //Bubble Sort
  //check with correct output
  "it" should "match with value for bubble sort" in {
    val bubbleSort = obj.bubbleSort(list)
    assert(List(2, 3, 5, 6, 7) == bubbleSort)
  }
  //check with wrong output
  "it" should "not match with value for bubble sort" in {
    val bubbleSort = obj.bubbleSort(list)
    assert(List(2, 4, 5, 6, 7) != bubbleSort)
  }

  //Selection Sort
  //Check with true give sorted Array
  "it" should "match with value for selection sort" in {
    val selectionSort = obj.selectionSort(list)
    assert(List(2, 3, 5, 6, 7) == selectionSort)
  }
  //check with wrong output
  "it" should "not match with value for selection sort" in {
    val selectionSort = obj.selectionSort(list)
    assert(List(2, 3, 2, 9, 7) != selectionSort)
  }


}

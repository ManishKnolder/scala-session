import org.scalatest.flatspec.AnyFlatSpec

class ElementsSquareTest extends AnyFlatSpec {
  val checkSquaredList= ElementsSquare
  val list: List[Int] = List(1,2,3,4)

  // 1. Checking with pattern matching part in ElementsSquare.scala class
  // 1.1-->It should give true
  "it" should "match with value squared by match" in {
    val result: List[Int] = checkSquaredList.squareListByPattern(list)
    assert(result == List(1, 4, 9, 16))
  }

  // 1.2-->It should give false
  "it" should "not match with value squared by match" in {
    val result: List[Int] = checkSquaredList.squareListByPattern(list)
    assert(result != List(1, 19, 9, 16))
  }

  // 2. Checking with map part in ElementsSquare.scala class
  // 2.1-->It should give true
  "it" should "match with value squared by map " in {
    val result: List[Int] = checkSquaredList.squareListByMap(list)
    assert(result == List(1, 4, 9, 16))
  }

  // 2.2-->It should give false
  "it" should "not match with value squared by map" in {
    val result: List[Int] = checkSquaredList.squareListByMap(list)
    assert(result != List(1, 19, 9.16))
  }

}

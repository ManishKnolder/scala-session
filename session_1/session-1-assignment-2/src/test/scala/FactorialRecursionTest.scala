import org.scalatest.flatspec.AnyFlatSpec

class FactorialRecursionTest extends AnyFlatSpec{
  val num: Int=5
  val accumulator: Int =1
  val fact = FactorialRecursion

  //It Should give True if we check == with correct value
  it should "match with value" in {
    val factorialResult: Int =fact.factorial(num,1)
    assert(factorialResult==120)
  }
  //It should give true if we check with not equal with wrong value
  it should "not match with value" in {
    val factorialResult: Int = fact.factorial(num, 1)
    assert(factorialResult != 10)
  }
}

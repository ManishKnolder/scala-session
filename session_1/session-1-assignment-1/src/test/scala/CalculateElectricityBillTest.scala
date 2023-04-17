import org.scalatest.flatspec.AnyFlatSpec

class CalculateElectricityBillTest extends AnyFlatSpec {
  val accountNumber: Int = 1001
  val username: String = "user1"
  val address: String = "Delhi"
  val previousUnit: Int = 5062
  val currentUnit: Int = 5904

  //Creating instance of case class CustomerDetails
  val account = CustomerDetails(accountNumber, username, address, previousUnit, currentUnit)

  //TEST WITH equals to equals to(==)
  it should "match with value" in {
    val firstBillAmount = CalculateElectricityBill.calculateBill(account)
    assert(firstBillAmount == 7073.51)
  }

  //Test with NOT EQUAL to (!=)
  it should "not match with value" in {
    val otherAccount = account.copy()
    val secondBillAmount = CalculateElectricityBill.calculateBill(otherAccount)
    assert(secondBillAmount != 3937.5)
  }

  it should "not match with negative current value" in {
    val otherAccount = account.copy(previousUnit = -100, currentUnit = -1000)
    val secondBillAmount = CalculateElectricityBill.calculateBill(otherAccount)
    assert(secondBillAmount != 39327.5)
  }

  it should "not match with negative unit" in {
    val otherAccount = account.copy(previousUnit = 100, currentUnit = 90)
    val secondBillAmount = CalculateElectricityBill.calculateBill(otherAccount)
    println(secondBillAmount)
    assert(secondBillAmount != 1472.05)
  }

  it should "match with value using asserResult" in {
    val firstBillAmount = CalculateElectricityBill.calculateBill(account)
    assertResult(7073.51) {
      firstBillAmount
    }
  }
}
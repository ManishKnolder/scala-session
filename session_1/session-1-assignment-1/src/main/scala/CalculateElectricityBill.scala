case class CustomerDetails(accountNumber: Int, username: String, address: String, previousUnit: Int, currentUnit: Int)

//Singleton Object
object CalculateElectricityBill extends App {
  //Method to calculate the electricity bill of the customer
  def calculateBill(billDetails: CustomerDetails): Double = {
    val totalUnit = billDetails.currentUnit - billDetails.previousUnit
    val totalAmount= getPrice(totalUnit)
    val gst =totalAmount*0.18
    val totalBillWithGst=totalAmount+gst
    totalBillWithGst
  }

  //Method to get the price as per the different slab
  def getPrice(unit: Int): Double = {
    try {
      if (unit <= 0) throw new ArithmeticException()
    }
    catch {
      case ex: ArithmeticException => print(ex.getMessage)
    }
    if (unit > 0 && unit <= 250) {
      val pricePerUnit: Double = 5.25
      val billOfFirstSlab: Double = unit * pricePerUnit
      billOfFirstSlab
    }
    else if (unit > 250 && unit <= 450) {
      val pricePerUnit: Double = 6.75
      val billOfFirstSlab: Double = 250 * 5.25
      val billOfSecondSlab: Double = (450 - unit) * pricePerUnit
      val totalSlabBill: Double = billOfSecondSlab + billOfFirstSlab
      totalSlabBill
    }
    else {
      val pricePerUnit: Double = 8.50
      val billOfFirstSlab: Double = 250 * 5.25
      val billOfSecondSlab: Double = (450 - 250) * 6.75
      val billOfThirdSlab: Double = (unit - 450) * pricePerUnit
      val totalSlabBill: Double = billOfFirstSlab + billOfSecondSlab + billOfThirdSlab
      totalSlabBill
    }
  }
}



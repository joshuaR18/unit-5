fun calculateProfit(
    numShares: Int,
    purchasePrice: Double,
    purchaseCommission: Double,
    salePrice: Double,
    saleCommission: Double
): Double {
    val totalPurchaseCost = numShares * purchasePrice + purchaseCommission
    val totalSaleCost = numShares * salePrice - saleCommission
    return totalSaleCost - totalPurchaseCost
}

fun main() {
    println("Enter the number of shares:")
    val numShares = readLine()!!.toInt()

    println("Enter the purchase price per share:")
    val purchasePrice = readLine()!!.toDouble()

    println("Enter the purchase commission paid:")
    val purchaseCommission = readLine()!!.toDouble()

    println("Enter the sale price per share:")
    val salePrice = readLine()!!.toDouble()

    println("Enter the sale commission paid:")
    val saleCommission = readLine()!!.toDouble()

    val profit = calculateProfit(numShares, purchasePrice, purchaseCommission, salePrice, saleCommission)

    if (profit >= 0) {
        println("You made a profit of $${profit}.")
    } else {
        println("You incurred a loss of $${-profit}.")
    }
}

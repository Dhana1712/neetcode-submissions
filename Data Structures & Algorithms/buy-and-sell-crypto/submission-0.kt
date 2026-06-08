class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var i = 0
        var j = 1
        for (j in 0 until prices.size) {
            if(prices[i] > prices[j]) {
                i = j
            } else {
                maxProfit = maxOf(prices[j] - prices[i], maxProfit)
            }
        }
        return maxProfit
    }
}

class Solution {
    fun hammingWeight(n: Int): Int {
        var res = 0
        for ( i in 0 until 32) {
            if ((1 shl i) and n != 0) {
                res++
            }
        }
        return res
    }
}

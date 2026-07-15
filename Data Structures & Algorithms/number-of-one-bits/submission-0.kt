class Solution {
    fun hammingWeight(n: Int): Int {
        var res = 0
        var num = 1
        for ( i in 0 until 32) {
            if (i != 0) {
                num = num shl 1
            }
            if (num and n != 0) {
                res++
            }
        }
        return res
    }
}

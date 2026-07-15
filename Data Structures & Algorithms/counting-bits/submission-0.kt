class Solution {
    fun countBits(n: Int): IntArray {
        val res = IntArray(n+1)
        for ( i in 0..n) {
            var count = 0
            for(j in 0 until 32) {
                if((1 shl j) and i != 0) {
                    count++
                }
            }
            res[i] = count
        }
        return res
    }
}

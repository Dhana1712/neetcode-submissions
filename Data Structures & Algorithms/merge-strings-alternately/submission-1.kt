class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val result = StringBuilder()
        val n = word1.length
        val m = word2.length
        var size = minOf(n, m)
        for(i in 0 until size) {
            result.append(word1[i])
            result.append(word2[i])
        }
        
        while(size < n) {
            result.append(word1[size])
            size++
        }
        while(size < m) {
            result.append(word2[size])
            size++
        }
        return result.toString()
    }
}

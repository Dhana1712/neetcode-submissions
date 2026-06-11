class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val map = HashMap<Char, Int>()
        var maxf = 0
        var result = 0
        var l = 0
        var r = 0
        while (r < s.length) {
            if (map[s[r]] == null) {
                map[s[r]] = 1
            } else {
                map[s[r]] = map[s[r]]!! + 1
            }
            maxf = maxOf(maxf, map[s[r]]!!)
            while(r-l+1-maxf > k) {
                map[s[l]] = map[s[l]]!! - 1
                l++
            }
            result = maxOf(r-l+1, result)
            r++
        }
        return result
    }
}

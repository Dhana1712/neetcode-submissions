class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val map = HashMap<Char, Int>()
        var maxlen = 0
        var l = 0
        var r = 0
        while(r < s.length) {
            if(map.contains(s[r]) && map[s[r]]!! >= l) {
                l = map[s[r]]!!+1
            }
            map[s[r]] = r
            print(l)
            print(r)
            println()
            maxlen = maxOf(r-l+1, maxlen)
            r++
        }
        return maxlen
    }
}

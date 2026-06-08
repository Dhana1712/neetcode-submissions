class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = HashSet<Char>()
        var maxlen = 0
        var l = 0
        var r = 0
        while(r < s.length) {
            while(set.contains(s[r])) {
                set.remove(s[l])
                l++
            }
            set.add(s[r])
            maxlen = maxOf(r-l+1, maxlen)
            r++
        }
        return maxlen
    }
}

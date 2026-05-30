class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val array = IntArray(26)
        for(ch in s) {
            array[ch-'a'] +=1
        }
        for(ch in t) {
            array[ch-'a'] -=1
            if(array[ch-'a'] < 0) return false
        }
        return true
    }
}

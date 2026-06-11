class Solution {
    fun minWindow(s: String, t: String): String {
        if (s.length < t.length) return ""
        val countT = HashMap<Char, Int>()
        t.forEach {
            if(countT[it] == null) {
                countT[it] = 1
            } else {
                countT[it] = countT[it]!! + 1
            }
        }
        var have = 0
        var need = countT.size
        var l = 0
        var r = 0
        var i = -1
        var j = -1
        val window = HashMap<Char, Int>()
        while(r < s.length) {
            val c = s[r]
            if(window[c] == null) {
                window[c] = 1
            } else {
                window[c] = window[c]!! + 1
            }
            if(countT.containsKey(c) && window[c] == countT[c]) {
                have++
            }

            while (have == need){
                if (i == -1 || j-i+1 > r-l+1) {
                    i = l
                    j = r
                }
                window[s[l]] = window[s[l]]!! - 1
                if (countT.containsKey(s[l]) && (window[s[l]] ?: 0) < countT[s[l]]!!) {
                    have--
                }
                l++
            }
            r++
        }
        return if (i == -1) "" else s.substring(i,j+1)
    }
}

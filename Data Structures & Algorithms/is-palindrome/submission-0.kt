class Solution {
    fun isPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length-1
        while (i < j) {
            if (!s[i].isLetterOrDigit()) {
                i++
            } else if (!s[j].isLetterOrDigit()) {
                j--
            } else {
                if (s[i].lowercaseChar() != s[j].lowercaseChar()) {
                    return false
                }
                j--
                i++
            }
        }
        return true
    }
}

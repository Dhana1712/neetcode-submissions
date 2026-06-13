class Solution {
    fun convertToTitle(columnNumber: Int): String {
        val str = StringBuilder()
        var columnNum = columnNumber
        while (columnNum > 0) {
            columnNum--
            val mod = columnNum%26
            columnNum = columnNum/26
            str.append("${'A' +  mod}")
        }
        return str.reverse().toString()
    }
}

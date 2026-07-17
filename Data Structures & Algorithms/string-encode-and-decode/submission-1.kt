class Solution {
    fun encode(strs: List<String>): String {
        if (strs.isEmpty()) return ""
        val sizes = mutableListOf<String>()
        for (str in strs) {
            sizes.add(str.length.toString())
        }
        return sizes.joinToString(",") + "#" + strs.joinToString("")
    }

    fun decode(encoded: String): List<String> {
        if (encoded.isEmpty()) return emptyList()
        val parts = encoded.split("#", limit = 2)
        val sizes = parts[0].split(",")
        val res = mutableListOf<String>()
        var i = 0
        for (sz in sizes) {
            if (sz.isEmpty()) continue
            val length = sz.toInt()
            res.add(parts[1].substring(i, i + length))
            i += length
        }
        return res
    }
}
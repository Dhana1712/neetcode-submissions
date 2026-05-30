class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()
        for (str in strs) {
            val array = IntArray(26)
            for (ch in str) {
                array[ch-'a']++
            }
            val key = array.joinToString(",")
            map[key] = map[key]?.apply { add(str) } ?: mutableListOf(str)
        }
        return map.values.toList()
    }
}

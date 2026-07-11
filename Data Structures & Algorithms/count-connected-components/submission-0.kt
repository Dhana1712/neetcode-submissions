class Solution {
    fun countComponents(n: Int, edges: Array<IntArray>): Int {
        var res = n

        val parent = Array(n) { it }
        fun find(i: Int): Int {
            if(parent[i] == i) return i

            parent[i] = find(parent[i])
            return parent[i]
        }

        edges.forEach {
            val x = find(it[0])
            val y = find(it[1])

            if (x != y) res--
            parent[x] = y
        }
        return res
    }
}

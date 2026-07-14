class Solution {
    fun findRedundantConnection(edges: Array<IntArray>): IntArray {

        val parent = Array(edges.size+1) { it }

        fun find(x: Int): Int {
            if(parent[x] == x) return x
            parent[x] = find(parent[x])
            return parent[x]
        }

        edges.forEach {
            val x = find(it[0])
            val y = find(it[1])

            if (x == y) return it
            parent[x] = y
        }
        return intArrayOf()
    }
}

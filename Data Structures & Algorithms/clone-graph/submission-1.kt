/*
Definition for a Node.
class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList()
}
*/

class Solution {
    fun cloneGraph(node: Node?): Node? {
        val map = mutableMapOf<Node, Node>()
        fun dfs(node: Node?): Node? {
            if (node == null) return null
            if (map[node] != null) {
                return map[node]!!
            } else {
                val copyNode = Node(node.`val`)
                map[node] = copyNode
                node.neighbors?.forEach {
                    copyNode.neighbors.add(dfs(it))
                }
                return copyNode
            }
        }
        return dfs(node)
    }
}

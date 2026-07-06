/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val queue: Queue<Pair<Int, TreeNode>> = LinkedList()
        val result = mutableMapOf<Int, MutableList<Int>>()
        var level = 0
        if (root != null) {
            queue.offer(level to root!!)
        }
        while(queue.isNotEmpty()) {
            val pair = queue.poll()
            val node = pair.second
            result[pair.first] = (result[pair.first] ?: mutableListOf()).apply { add(node.`val`)}
            node.left?.let {
                queue.offer(pair.first+1 to it)
            }
            node.right?.let {
                queue.offer(pair.first+1 to it)
            }
        }
        return result.values.toList()
    }
}

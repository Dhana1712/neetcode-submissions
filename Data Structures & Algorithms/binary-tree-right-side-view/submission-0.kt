/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        val queue: Queue<TreeNode> = LinkedList<TreeNode>()
        val result = mutableListOf<Int>()
        if (root != null) {
            queue.offer(root)
        }
        while(queue.isNotEmpty()) {
            val len = queue.size
            for (i in 0 until len) {
                val node = queue.poll()
                node.right?.let { queue.offer(it) }
                node.left?.let { queue.offer(it) }
                if (i == 0) {
                    result.add(node.`val`)
                }
            }
        }
        return result
    }
}

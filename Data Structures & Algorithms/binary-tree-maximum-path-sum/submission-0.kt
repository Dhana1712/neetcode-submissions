/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxPathSum(root: TreeNode?): Int {
        var maxSum = Int.MIN_VALUE
        fun dfs(root: TreeNode?): Int {
            if(root == null) return 0

            val left = dfs(root?.left)
            val right = dfs(root?.right)
            maxSum = maxOf(maxSum, root.`val`!!, root.`val`!!+left+right, root.`val`!!+left, root.`val`!!+right)
            return maxOf(root.`val`!!, root.`val`!!+left, root.`val`!!+right)
        }
        dfs(root)
        return maxSum
    }
}

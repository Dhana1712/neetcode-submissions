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
            val left = maxOf(0, dfs(root?.left))
            val right = maxOf(0, dfs(root?.right))
            maxSum = maxOf(maxSum, root.`val`!!+left+right)
            return maxOf(left,right) + root.`val`
        }
        dfs(root)
        return maxSum
    }
}

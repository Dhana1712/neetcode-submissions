/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        var result = true
        fun dfs(root: TreeNode?): Int {
            if (root == null) return 0
            val left = dfs(root.left)
            val right = dfs(root.right)
            if (abs(left - right) > 1) {
                result = false
            }
            return maxOf(left, right) + 1
        }
        dfs(root)
        return result
    }
}

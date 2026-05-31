/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        var max = 0
        fun dfs(root: TreeNode?): Int {
            if(root == null) return 0
            val left = dfs(root.left)
            val right = dfs(root.right)
            max = maxOf(max, left + right)
            return maxOf(left, right) + 1
        }
        dfs(root)
        return max
    }
}

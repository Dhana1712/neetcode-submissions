/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        dfs(root, result)
        return result
    }

    fun dfs(root: TreeNode?, result: MutableList<Int>) {
        if (root == null) return
        dfs(root.left, result)
        dfs(root.right, result)
        result.add(root.`val`)
    }
}

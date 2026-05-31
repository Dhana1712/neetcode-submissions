/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        dfs(root, result)
        return result
    }

    fun dfs(root: TreeNode?, result: MutableList<Int>) {
        if (root == null) return
        result.add(root.`val`)
        dfs(root.left, result)
        dfs(root.right, result)
    }
}

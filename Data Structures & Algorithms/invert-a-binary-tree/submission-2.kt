/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        dfs(root)
        return root
    }

    fun dfs(root: TreeNode?) {
        if (root == null) return
        dfs(root.right)
        dfs(root.left)
        val temp = root!!.right
        root!!.right = root!!.left
        root!!.left = temp
    }
}

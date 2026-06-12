/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (subRoot == null) return true
        if (root == null) return false
        if (root?.`val` == subRoot?.`val` && isSameTree(root, subRoot)) {
            return true
        } 
        return  isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
    }

    fun isSameTree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (root == null && subRoot == null) return true
        val left = isSameTree(root?.left, subRoot?.left)
        val right = isSameTree(root?.right, subRoot?.right)
        return left && right && root?.`val` == subRoot?.`val`
    }
}

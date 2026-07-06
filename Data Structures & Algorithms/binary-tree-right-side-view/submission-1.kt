/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        val res = mutableListOf<Int>()
        fun dfs(root: TreeNode?, depth: Int){
            if (root == null) return
            if(depth == res.size) {
                res.add(root.`val`)
            }
            dfs(root.right, depth+1)
            dfs(root.left, depth+1)
        }
        dfs(root, 0)
        return res
    }
}

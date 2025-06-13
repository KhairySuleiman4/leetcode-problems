/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val vals = mutableListOf<Int>()
        getAllVals(vals, root)
        return vals
    }

    private fun getAllVals(vals: MutableList<Int>, node: TreeNode?) {
        if (node == null) return
        getAllVals(vals, node.left)
        getAllVals(vals, node.right)
        vals.add(node.`val`)
    }
}
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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val vals = mutableListOf<Int>()
        getAllVals(vals, root)
        return vals
    }

    private fun getAllVals(vals: MutableList<Int>, node: TreeNode?) {
        if (node == null) return
        getAllVals(vals, node.left)
        vals.add(node.`val`)
        getAllVals(vals, node.right)
    }
}
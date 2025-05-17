/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        getAllVals(vals, root);
        return vals;
    }

    private void getAllVals(List<Integer> vals, TreeNode node){
        if(node == null){
            return;
        }
        vals.add(node.val);
        getAllVals(vals, node.left);
        getAllVals(vals, node.right);
    }
}
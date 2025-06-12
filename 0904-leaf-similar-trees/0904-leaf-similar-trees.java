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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> values1 = getLeafValues(root1);
        List<Integer> values2 = getLeafValues(root2);
        if(values1.size() != values2.size()){
            return false;
        }
        for(int i = 0; i < values1.size(); i++){
            if(!values1.get(i).equals(values2.get(i))){
                return false;
            }
        }
        return true;
    }

    private List<Integer> getLeafValues(TreeNode node) {
        List<Integer> values = new ArrayList<>();
        collectLeaves(node, values);
        return values;
    }

    private void collectLeaves(TreeNode node, List<Integer> values) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            values.add(node.val);
            return;
        }
        collectLeaves(node.left, values);
        collectLeaves(node.right, values);
    }

}
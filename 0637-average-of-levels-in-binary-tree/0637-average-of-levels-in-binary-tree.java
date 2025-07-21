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
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return result;
        }
        q.add(root);
        while(!q.isEmpty()){
            int ls = q.size();
            int t = ls;
            double s=0;
            for(int i=0; i<ls; i++){
                TreeNode curr = q.remove();
                s += curr.val;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);


            }
            result.add(s/t);
        }
        return result;
        
    }
}
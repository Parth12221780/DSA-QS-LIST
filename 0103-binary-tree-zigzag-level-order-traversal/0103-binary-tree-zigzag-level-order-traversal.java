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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> q = new LinkedList<>();
        if(root == null) return result;
        q.add(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int ls = q.size();
            

            
                for(int i=0; i<ls; i++){
                    if(leftToRight){
                    TreeNode curr = q.removeFirst();
                    list.add(curr.val);
                    if(curr.left != null) q.addLast(curr.left);
                                                                                                            if(curr.right != null) q.addLast(curr.right);

                    }else{
                        TreeNode curr = q.removeLast();
                        list.add(curr.val);
                                                                                                                if(curr.right != null) q.addFirst(curr.right);
                                                                                                                if(curr.left != null) q.addFirst(curr.left);



                    }
                                                                                                        }
                    leftToRight = !leftToRight;
                
            
            result.add(list);

        }
        return result;
    }

}
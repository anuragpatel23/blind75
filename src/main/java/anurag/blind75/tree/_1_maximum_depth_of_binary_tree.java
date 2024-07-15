package anurag.blind75.tree;

public class _1_maximum_depth_of_binary_tree {
    public static void main(String... args){
        TreeNode tree = new TreeNode();
        tree=new TreeNode(3, new TreeNode(9,null, null),
                new TreeNode(20,new TreeNode(15,null, null),
                        new TreeNode(7,null, null)));

        int result=maxDepth(tree);
        System.out.println(result);
    }

    private static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            int leftMax=maxDepth(root.left);
            int rightMax=maxDepth(root.right);

            return Math.max(leftMax, rightMax)+1;
        }
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {

          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
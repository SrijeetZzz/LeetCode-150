public class MaxDepth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        MaxDepth tree = new MaxDepth();
        
        TreeNode root = tree.new TreeNode(3);
        root.left = tree.new TreeNode(9);
        root.right = tree.new TreeNode(20, tree.new TreeNode(15), tree.new TreeNode(7));

        int depth = maxDepth(root);
        System.out.println("Maximum depth of the tree: " + depth);
    }
    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1+ Math.max(leftDepth, rightDepth);
  }

}

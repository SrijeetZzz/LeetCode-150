public class SymmetricTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        return  isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static void main(String[] args) {
        SymmetricTree tree = new SymmetricTree();

        TreeNode root = tree.new TreeNode(1);
        root.left = tree.new TreeNode(2);
        root.right = tree.new TreeNode(2);
        root.left.left = tree.new TreeNode(3);
        root.left.right = tree.new TreeNode(4);
        root.right.left = tree.new TreeNode(4);
        root.right.right = tree.new TreeNode(3);

        System.out.println(tree.isSymmetric(root));
    }
}







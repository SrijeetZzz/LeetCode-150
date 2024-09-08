public class SameTree {
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
        SameTree tree = new SameTree();

        TreeNode p = tree.new TreeNode(1);
        p.left = tree.new TreeNode(2);
        p.right = tree.new TreeNode(3);

        TreeNode q = tree.new TreeNode(1);
        q.left = tree.new TreeNode(2);
        q.right = tree.new TreeNode(3);

        boolean isSame = isSameTree(p, q);
        System.out.println(isSame);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}


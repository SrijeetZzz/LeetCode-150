public class InvertBinaryTree {
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
        InvertBinaryTree tree = new InvertBinaryTree();
        TreeNode root = tree.new TreeNode(1);
        root.left = tree.new TreeNode(2);
        root.right = tree.new TreeNode(3);
        root.left.left = tree.new TreeNode(4);
        root.left.right = tree.new TreeNode(5);
        root.right.left = tree.new TreeNode(6);
        root.right.right = tree.new TreeNode(7);

        System.out.println("Original tree (inorder):");
        printInorder(root);

        invertTree(root);

        System.out.println("\nInverted tree (inorder):");
        printInorder(root);

        
    }
    public static void printInorder(TreeNode root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
    public static TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        
    }
}

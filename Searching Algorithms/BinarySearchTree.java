class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeSearch {
    public static boolean binarySearch(TreeNode root, int target) {
        while (root != null) {
            if (target == root.val) {
                return true;
            } else if (target < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);


        int target = 7;
        boolean found = binarySearch(root, target);
        System.out.println("Value " + target + " found: " + found);
    }
}

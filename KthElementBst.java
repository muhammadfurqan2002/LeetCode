class TreeNode {
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

class kthElementBst {
    static int num = 0;
    static int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        findMin(root);
        return num;
    }

    public void findMin(TreeNode root) {
        if (root.left != null) {
            findMin(root.left);
        }
        count--;
        if (count == 0) {
            num = root.val;
            return;
        }
        if (root.right != null) {
            findMin(root.right);
        }
    }

    public static void main(String[] args) {
        kthElementBst obj = new kthElementBst();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(obj.kthSmallest(root, 3));
    }

}
 public class TreeNode {
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

class MinimumDiffBst{
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;

    public int getMinimumDifference(TreeNode root) {
        if(root==null) return min;

        getMinimumDifference(root.left);

        if(prev!=null){
            min=Math.min(min,root.val-prev.val);
        }
        if(root!=null){
            prev=root;
        }
        getMinimumDifference(root.right);
        return min;
    }
    public static void main(String[] args) {
        MinimumDiffBst obj=new MinimumDiffBst();
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        System.out.println(obj.getMinimumDifference(root));
    }
}
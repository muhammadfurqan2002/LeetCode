import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
 
class AveBstLevel {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList();
        List<Double> l=new ArrayList();
        q.add(root);
        q.add(null);
        while(q.peek()!=null){
            double sum=0;
            int level=0;
            while(q.peek()!=null){
                TreeNode node=q.poll();
                sum+=node.val;
                level++;
                if(node.left!=null){
                    q.add(node.left);
                }
                 if(node.right!=null){
                    q.add(node.right);
                }
            }
            q.add(q.poll());
            l.add(sum/level);
        }      
        return l;
    }
    public static void main(String[] args) {
        AveBstLevel obj=new AveBstLevel();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(obj.averageOfLevels(root));
    }
}
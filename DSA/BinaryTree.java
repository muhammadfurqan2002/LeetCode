import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {
    static Node root;
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    public void insert(int data){
     Node newNode=new Node(data);
     if(root==null){
        root=newNode;
        return;
     }   
     Queue<Node> queue=new LinkedList<>();
     queue.add(root);
     while(!queue.isEmpty()){
        Node temp=queue.poll();

        if(temp.left==null){
            temp.left=newNode;
            break;
        } else {
            queue.add(temp.left);
        }

        if(temp.right==null){
            temp.right=newNode;
            break;
        } else {
            queue.add(temp.right);
        }
        
     }
    }

    public static void _InOrder(){
        InOrder(root);
    }
    private static void InOrder(Node node) {
        if(node == null) return;
        InOrder(node.left);
        System.out.print(node.data + " ");
        InOrder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(0);
        tree.insert(2);
        tree.insert(1);
        tree.insert(7);
        tree.insert(6);
        tree.insert(4);
        tree._InOrder();
    }

}

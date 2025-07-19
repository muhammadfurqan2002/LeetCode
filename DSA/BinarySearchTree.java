import java.util.Queue;
import java.util.LinkedList;

public class BinarySearchTree {
    static Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void insert(int data) {
        root = tree(data, root);
    }

    public static Node tree(int data, Node root) {
        Node newNode = new Node(data);
        if (root == null) {
            return newNode;
        }

        if (root.data > data) {
            root.left = tree(data, root.left);
        } else if (root.data < data) {
            root.right = tree(data, root.right);
        }
        return root;
    }

    public static void _InOrder() {
        InOrder(root);
    }

    public static void InOrder(Node node) {
        if (node == null)
            return;
        InOrder(node.left);
        System.out.print(node.data + " ");
        InOrder(node.right);
    }

    public static void _PreOrder() {
        PreOrder(root);
    }

    public static void PreOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public static void _PostOrder() {
        PostOrder(root);
    }

    public static void PostOrder(Node node) {
        if (node == null)
            return;
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void _LevelOrder() {
        LevelOrder(root);
    }

    public static void LevelOrder(Node root){
        if(root==null)return;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            if (temp == null) {
                if (queue.isEmpty()) {
                    break;
                } else {
                    System.out.println();
                    queue.add(null);
                    continue;
                }
            }
            System.out.print(temp.data + " ");

            if(temp.left!=null) {
                queue.add(temp.left);
            }
            if (temp.right!=null) {
                queue.add(temp.right);
                
            }
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        System.out.print("InOrder: ");
        tree._InOrder();
        System.out.println();

        System.out.print("PreOrder: ");
        tree._PreOrder();
        System.out.println();

        System.out.print("PostOrder: ");
        tree._PostOrder();

        System.out.println("\nLevelOrder: ");
        tree._LevelOrder();
    }
}

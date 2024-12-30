package Data_Structure;

public class Linked_List {
    
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void addFirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        head.next=node;
        head=node;
    }
    public static void addLast(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node newNode=new Node(data);
        Node prev=null;
        Node cur=head;
        while (cur.next!=null) {
            prev=cur;
            cur=cur.next;
        }
        cur.next=newNode;
        newNode.next=null;
        cur=newNode;
    }

    public static int deleteFirst(){
        if (head==null) {
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }

    public static int deleteLast(){
        if(head==null){
            return -1;
        }
        Node prev=null;
        Node cur=head;
        while (cur.next!=null) {
            prev=cur;
            cur=cur.next;
        }
        int last=cur.data;
        prev.next=null;
        return last;
    }

    public static void display(){
        Node cur=head;
        while (cur.next!=null) {
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    public static void main(String[] args) {
        addFirst(0);
        addFirst(2);
        addFirst(3);
        display();
    }
}

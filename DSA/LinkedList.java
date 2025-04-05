package DSA;

public class LinkedList {
    static Node head;
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node cur=head;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=newNode;
        newNode.next=null; 
    }

    public static void display(){
        Node cur = head;
        while (cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
    }

    public static int deleteFirst(){
        if(head==null){
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
        Node cur=head;
        Node prev=null;
        while (cur.next!=null){
            prev=cur;
            cur=cur.next;
        }
        int last=cur.data;
        prev.next=null;
        return last;
    }
    public static void addIndex(int data,int index){
        Node newNode=new Node(data);
        if(index==0){
            addFirst(data);
            return;
        }
        Node cur=head;
        for (int j=0;j<index-1;j++){
            cur=cur.next;
        }
        newNode.next=cur.next;
        cur.next=newNode;
    }
}



public package Data_Structure;

class Doubly_LinkedList {
    static 
    static class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=null;
        if(head==null){
            head=newNode;
            newNode.prev=null;
        }
        head.next=newNode;
        newNode.prev=head;
        head=newNode;
    }

    public static void addLast(int data){
        Node cur=head;
        Node newNode=new Node(data);
        newNode.next=null;
        while (cur!=null) {
            cur=cur.next;
        }
        cur.next=newNode;
        newNode.prev=cur;
        cur=newNode;
        if(head==null){
            head=newNode;
            newNode.prev=null;
        }
    }

    public static int deleteFirst(){
        if(head==null){
            return -1;
        }
        int top=head.data;
        head=head.next;
        head.prev=null;
        return top;
    }
    public static int deleteLast(){
        if(head==null){
            return -1;
        }
       Node cur=head;
       Node prev=null;
       while (cur.next!=null) {
           prev=cur;
           cur=cur.next; 
       }
       int last=cur.data;
       prev.next=null;
        return last;
    }

    public static void display(){
        Node _cur=head;
        Node _prev=null;
        while (_cur!=null) {
            _prev=_cur;
            System.out.print(_cur.data+"->");
            _cur=_cur.next;
        }
        while (_prev!=null) {
            System.out.print(_prev.data+"->");
            _prev=_prev.prev;
        }

    }
    
}
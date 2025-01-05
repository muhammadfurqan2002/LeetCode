package Data_Structure;

public class CircularLinkedList {
    static Node start,end;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void insert(int data){
        Node newNode=new Node(data);
        if(start==null){
            start=newNode;
            end=newNode;
            return;
        }
        end.next=newNode;
        newNode.next=start;
        end=newNode;
    }
    public static void display(){
        if(start==null){
            return;
        }
        Node cur=start;
        do{
            System.out.println(cur.data);
            cur=cur.next;
        }while(cur!=start);
    }
    public static int delete(){
        if(start==null){
            return -1;
        }
        int data=start.data;
        start=start.next;
        end.next=start;
        return data;
    }
    public static void main(String[] args) {
        insert(0);
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        display();
    }
}

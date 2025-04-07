public class CircularLinkedList {
    Node start,end;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void add(int data){
        Node newNode =new Node(data);
        if(start==null){
            start=newNode;
            end=newNode;
            end.next=start;
        }
        end.next=newNode;
        end=newNode;
        end.next=start; 
    }
    public void display(){
        Node cur=start;
        do{
            System.err.println(cur.data);
            cur=cur.next;  
        }while(cur!=start);
    }
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(1);
        cll.add(2);
        cll.add(3);
        cll.display();
    }   
}

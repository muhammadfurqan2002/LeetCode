public class QueueNode {
    Node first,last;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(first==null){
            first=newNode;
            last=newNode;
            return;
        }
        newNode.next=null;
        last.next=newNode;
        last=newNode;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data=first.data;
        first=first.next;               
        return data;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return first.data;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node current=first;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueNode queue=new QueueNode();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); 
        System.out.println("Dequeued: " + queue.dequeue()); 
        queue.display(); 
        System.out.println("Peek: " + queue.peek());
    }
}

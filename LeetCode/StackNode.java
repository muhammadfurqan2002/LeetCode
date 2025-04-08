public class StackNode {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void push(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public int peek(){
        if(head==null){
            return -1;
        }
        return head.data;
    }

    public int pop(){
        if(head==null){
            return -1;
        }
        int data=head.data;
        head=head.next;
        return data;
    }

    public boolean isEmpty(){
        return head==null;
    }
    public void print(){
        if(head==null){
            System.out.println("Stack is empty");
            return;
        }
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }

    public static void main(String[] args) {
        StackNode stack=new StackNode();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        System.out.println("Peek: "+stack.peek());
        System.out.println("Pop: "+stack.pop());
        stack.print();
        System.out.println("Is empty: "+stack.isEmpty());
    }
}

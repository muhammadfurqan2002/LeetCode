public class DoublyLinkedList {
    static Node head;

    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.prev = null;
        if (head == null) {
            head = newNode;
            head.next = null;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        newNode.prev = null;
        if (head == null) {
            head = newNode;
            head.next = null;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
        newNode.prev = cur;
        newNode.next = null;
    }

    public void display() {
        Node cur = head;
        Node prev = null;
        while (cur != null) {
            System.out.print(cur.data + "->");
            prev = cur;
            cur = cur.next;
        }
        System.out.println();
        while (prev != null) {
            System.out.print(prev.data + "<-");
            prev = prev.prev;
        }
    }

    public int deleteFirst() {
        if (head == null) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        head.prev = null;
        return top;
    }

    public int deleteLast() {
        if (head == null) {
            return -1;
        }
        if(head.next==null){
            int top = head.data;
            head = null;
            return top;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        int top = cur.data;
        cur.prev.next = null;
        cur.prev = null;
        return top;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(10);
        dll.deleteLast();
        dll.display();
    }
}

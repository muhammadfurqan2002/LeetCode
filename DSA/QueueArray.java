public class QueueArray {
    int [] array;
    int front, last, size, capacity;
    QueueArray(){
        capacity = 10;
        array = new int[capacity];
        front = size = 0;
        last = capacity - 1;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        last = (last + 1) % capacity;
        array[last] = data;
        size++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data = array[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return array[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = 0; i < size; i++){
            System.out.print(array[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueArray queue = new QueueArray();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        System.out.println("Dequeue: " + queue.dequeue());
        queue.display();
    }

}

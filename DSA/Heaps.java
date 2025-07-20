public class Heaps {

    static int [] array=new int[100];
    static int size=0;

 

    public static void minHeap(int value){
        array[size]=value;
        int current=size;
        size++;

        while(current>0){
            int parent=(current-1)/2;
            if(array[current]<array[parent]){
                swap(array, current, parent);
                current= parent;
            }else{
                break;
            }
        }
    }


    public static void maxHeap(int value){
        array[size] = value;
        int current=size;
        size++;

        while(current>0){
            int parent=(current-1)/2;
            if(array[current]>array[parent]){
                swap(array, current, parent);
                current = parent;
            } else {
                break;
            }
        }

    }

    public static void delete(){
        if(size==0){
            System.err.println("Heap is empty");
            return;
        }
        array[0] = array[size - 1];
        size--;
        int current=0;
        while(current<size){
            int left=2*current + 1;
            int right=2*current + 2;
            int largest=current;
            if(left<size && array[left]>array[largest]){
                largest=left;
            }
            if(right<size && array[right]>array[largest]){
                largest=right;
            }
            if(largest!=current){
                swap(array, current, largest);
                current = largest;
            } else {
                break;
            }
        }
    }

    public static void swap(int[]array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void display(){
        for(int i=0; i<size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // minHeap(10);
        // minHeap(20);
        // minHeap(5);
        // minHeap(6);
        // minHeap(1);

        maxHeap(0);
        maxHeap(10);
        maxHeap(20);
        maxHeap(5);
        maxHeap(6);
        maxHeap(100); 

        delete();
        display();
    }
    
}

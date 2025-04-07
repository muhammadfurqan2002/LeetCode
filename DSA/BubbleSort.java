public class BubbleSort {
    public static void bubbleSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;                
                }
            }
        }
    }   
    public static void display(int[]array){
        for(int x:array){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println("Before sorting:");
        display(array);
        bubbleSort(array);
        System.out.println("After sorting:");
        display(array); 
    }
}

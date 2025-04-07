package LeetCode;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] array){
        if (array.length==0){
            return 0;
        }
        int k=1;
        for(int i=1;i<array.length;i++){
            if(array[i]!=array[i-1]){
                array[k++]=array[i];
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(array);
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

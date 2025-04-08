package LeetCode;

public class RemoveTriplets {
    public int removeTriplets(int[] array){
        int k=2;
        for(int i=2;i<array.length;i++){
            if(array[i]!=array[i-2]){
                array[k++]=array[i];
            }
        }
        return k;
    }
    public static void main(String[] args) {
        RemoveTriplets obj = new RemoveTriplets();
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4};
        int newLength = obj.removeTriplets(array);
        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

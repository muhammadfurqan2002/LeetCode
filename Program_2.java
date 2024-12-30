public class Program_2 {

    public static int removeDuplicate(int[] array,int target){
         int x=0;
         for(int i=0;i<array.length;i++){
            if(array[i]!=target){
                array[x++]=array[i];
            }
         }
         return x;
    }
public static void main(String[] args) {
   int [] nums = {0,1,2,2,3,0,4,2};
   int val = 2;
   System.out.println(removeDuplicate(nums, val));
 }   
}

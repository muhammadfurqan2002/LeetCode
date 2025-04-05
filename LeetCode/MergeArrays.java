package LeetCode;

public class MergeArrays {

    public static void Merge(int []arr1, int n, int [] arr2, int m) {
      if(m+n==1 && n!=0){
        arr1[0] = arr2[0];
        return;
      } 
    
      int l=m+n-1,left=m-1,right=n-1;
      while(right>=0){
        if(left>=0 && arr1[left]>arr2[right]){
            arr1[l--]=arr1[left--];
        }else{
            arr1[l--]=arr2[right--];
        }
      }
      for(int x:arr1){
        System.out.println(x);
      }

    }
    public static void main(String[] args) {
        int []arr1 = {1,2,3,0,0,0};
        int []arr2 = {2,5,6};
        Merge(arr1, 3, arr2, 3);
    }

    
}

/**
 * Program_1
 */
public class Program_1 {

    public static void mergeSTortedArrays(int [] arr1,int m,int []arr2,int n){
            if(m+n==1 && n!=0){
                arr1[0]=arr2[0];
            }

            int totalLength=m+n-1;
            int i=m-1,j=n-1;
            while (j>=0) {
                if(i>=0 && arr1[i]>arr2[j]){
                    arr1[totalLength--]=arr1[i--];
                }else{
                    arr1[totalLength--]=arr2[j--];
                }
            }

            for (int x : arr1) {
                System.out.println(x);
            }

    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,0,0,0};
        int[] arr2={2,5,6};
        int m=3,n=3;
        mergeSTortedArrays(arr1, m, arr2, n);
    }
    
}
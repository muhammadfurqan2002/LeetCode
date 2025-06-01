public class MergeSort{
    public static void _merge(int array[],int start,int end){
        if(start>=end)return;
        int mid=start+(end-start)/2;
        _merge(array, start, mid);
        _merge(array, mid+1,end);
        _sort(array, start, end, mid);
    }
    public static void _sort(int array[],int start,int end,int mid){
        int[] newArray=new int[end-start+1];
        int x=0,i=start,j=mid+1;
        while(i<=mid && j<=end){
            if (array[i] <= array[j]) {
                newArray[x++] = array[i++];
            } else {
                newArray[x++] = array[j++];
            }
        }
        while(i <= mid) {
            newArray[x++] = array[i++];
        }
        while (j<= end) {
            newArray[x++] = array[j++];
        }
        for(int k=0,l=start; k<newArray.length; k++,l++){
            array[l]=newArray[k];
        }
    }
    public static void main(String[] args) {
        int[] array={12, 11, 13, 5, 6, 7};
        int end = array.length-1;
        int start = 0;
        _merge(array, start, end);
        for(int x : array){
            System.out.print(x + " ");
        }
    }
}
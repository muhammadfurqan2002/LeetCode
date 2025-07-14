public class QuickSort {

    
    public static void _Insert(int array[],int start,int end){
            if(start<=end){
                int pivotIndex=_Pivot(array, start, end);
                _Insert(array,start,pivotIndex-1);
                _Insert(array,pivotIndex+1,end);
            }
    }

    public static int _Pivot(int []array,int s,int n){
        int pivot=array[s];
        int i=s,j=n;
        while(i<=j){
            if(array[i]<=pivot){
                i++;
            }else if(array[j]>pivot){
                j--;
            }
            if(i<j){
                _Swap(array, i, j);
            }
        }
        _Swap(array, s, j);
        return j;
    }

    public static void _Swap(int array[],int i,int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }

    public static void display(int array[]){
        for(int x:array){
            System.out.println(x);
        }
    }

    
    public static void main(String[] args) {
        int array[]={10,7,8,9,1,5};
        int n=array.length;
        _Insert(array, 0, n-1);
        System.out.println("Sorted array:");
        display(array);
    }
}

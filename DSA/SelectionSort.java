public class SelectionSort {

    public static void _Sort(int array[]){
        for(int i=0;i<array.length-1;i++){
            int x=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[x]){
                    x=j;
                }
            }
            _Swap(array, i, x);
        }
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

        int array[]={64,25,12,22,11};
        _Sort(array);
        System.out.println("Sorted array:");
        display(array);
    }
}

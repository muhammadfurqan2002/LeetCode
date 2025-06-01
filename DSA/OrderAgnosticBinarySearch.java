public class OrderAgnosticBinarySearch  {
    public static int _search(int[] array,int target){
        if(array.length==0)return -1;
        if(array[0] == target)return 0;
        if(array[array.length-1] == target)return array.length - 1;
        if(array[0] > target || array[array.length - 1] < target)return -1;
        int start = 0, end = array.length - 1;
        int mid=start+(end-start)/2;
        while (start<=end) {
            if (array[mid] == target) {
                return mid;
            }else if (array[mid] < target) {
                start = mid - 1;
            } else {
                end = mid + 1;
            }
            mid= start + (end - start) / 2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array = {40, 10, 4, 3, 2};
        int target = 10;
        int result = _search(array, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    
}

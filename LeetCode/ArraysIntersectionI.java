import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ArraysIntersectionI{


    public static int[] intersection(int[] nums1,int[] nums2){
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();

        for(int i :nums1){
            map.put(i,1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                list.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }

        int [] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }

        return result;
        
    }



    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersection(nums1, nums2);
        
        for (int num : result) {
            System.out.print(num + " ");
        }       
    }
}
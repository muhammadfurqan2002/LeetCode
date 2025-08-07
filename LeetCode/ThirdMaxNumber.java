public class ThirdMaxNumber {

    public static int thirdMax(int[] nums) {
        long v1=Long.MIN_VALUE, v2=Long.MIN_VALUE, v3=Long.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(val==v1 || val==v2 || val==v3) {
                continue; 
            }

            if(val>v1){
                v1=v2;
                v2=v3;
                v3=val;
            }else if(val>v2){
                v1=v2;
                v2=val;
            }else if(val>v3){
                v3=val;
            }
        }
        if(v3==Long.MIN_VALUE) {
            return (int)v1;
        }
        return (int)v3;
    }
    public static void main(String[] args) {
 
        int[] nums = {3, 2, 1};
        int result = thirdMax(nums);
        System.out.println(result);
        int[] nums2 = {1, 2};
        int result2 = thirdMax(nums2);
        System.out.println(result2);

        int[] nums3 = {2, 2, 3, 1};
        int result3 = thirdMax(nums3);
        System.out.println(result3);

    }
    
}

public class MaximumAverageSubArray {
        public double findMaxAverage(int[] nums, int k) {
            int i=0,j=0;
            double sum=0,max=-1111;
            while(j<=nums.length-1){
                sum+=nums[j];
                if(j-i+1==k){
                    max=Math.max(max,(sum/k));
                    sum-=nums[i++];
                }
                j++;
            }
            return max;
        } 
    public static void main(String[] args) {
        MaximumAverageSubArray obj=new MaximumAverageSubArray();
        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(obj.findMaxAverage(nums,k));
    }
}

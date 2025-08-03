class FindSqrt{
    public static int sqrt(int x){
        if(x==0 || x==1) return x;
        int low=1,high=x;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            long _sqrt=(long)mid*mid;

            if(_sqrt==x){
                return mid;
            }else if(_sqrt<x){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int x = 8;
        System.out.println("The square root of " + x + " is: " + sqrt(x));
        
        x = 16;
        System.out.println("The square root of " + x + " is: " + sqrt(x));
        
        x = 0;
        System.out.println("The square root of " + x + " is: " + sqrt(x));
        
        x = 1;
        System.out.println("The square root of " + x + " is: " + sqrt(x));
    }
}
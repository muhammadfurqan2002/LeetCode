class DivideTwoInteger{
    public static int Divide(int dividend ,int divisor){
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        long dd=Math.abs((long)dividend);
        long dv=Math.abs((long)divisor);

        int result=0;
        while(dv<=dd){
            long sum=dv;
            int count=0;
            while(sum<=dd-sum){
               sum+=sum;
               count+=count;
            }
            dd-=sum;
            result+=count;
        }
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0)){
            return -result;
        }
        return result;
    }
 public static void main(String[] args){
        int dividend = 120;
        int divisor = 3;
        System.out.println("Result of division: " + Divide(dividend, divisor));
 }
}
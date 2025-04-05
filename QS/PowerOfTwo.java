class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<31;i++){
            int x=(int)Math.pow(2,i);

            if(x==n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(16));
    }
}
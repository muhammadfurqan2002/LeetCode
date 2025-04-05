class Number_1_Bits {
    public static int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            int lsb=n&1;
            if(lsb==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=11;
        // binary n=00000000000000000000000000001011
        System.out.println(hammingWeight(n));
    }
}
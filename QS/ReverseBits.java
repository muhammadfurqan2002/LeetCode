public class ReverseBits {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
            int lsb=n&1;
            int reverseLsb=lsb<<(31-i);
            result=result|reverseLsb;
            n=n>>1;
        }
        return result;

    }
    public static void main(String[] args) {
        int n=964176192;
        // 00000010100101000001111010011100   binary
        System.out.println(reverseBits(n));
    }
}
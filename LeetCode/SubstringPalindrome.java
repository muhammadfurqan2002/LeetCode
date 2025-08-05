class SubstringPalindrome{

    public static String _Palindrome(String s){
        int maxLength=1;
        int start=0,left,right,length=s.length();

        for(int  i=1;i<length;i++){
            left=i-1;
            right=i;
            while(left>=0 && right<length && s.charAt(left)==s.charAt(right)){
                if(right-left+1>maxLength){
                    maxLength=right-left+1;
                    start=left;
                }
                left--;
                right++;
            }
            
            left=i-1;
            right=i+1;
            while(left>=0 && right<length && s.charAt(left)==s.charAt(right)){
                if(right-left+1>maxLength){
                    maxLength=right-left+1;
                    start=left;
                }
                left--;
                right++;
            }
        }

        return s.substring(start, start+maxLength);
    }

    public static void main(String[] args) {
        String s="bababa";

        System.err.println(_Palindrome(s));
    }
}
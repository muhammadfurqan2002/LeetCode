class AddBinary {
    public static String addBinary(String a, String b) {
        int i=a.length()-1,j=b.length()-1;
        int carry=0;
        // StringBuilder s=new StringBuilder();
        String s="";
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            carry=sum>1?1:0;
            // s.append(sum%2);
            s=sum%2+s;
        }

        if(carry!=0){
            // s.append(carry);
            s=carry+s;
        }
        // return s.reverse().toString();
        return s;
    }
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
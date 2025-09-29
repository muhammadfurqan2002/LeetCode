package LeetCode.Strings;

public class RemoveVowels {
    public static String removeString(String name){
        StringBuilder st=new StringBuilder();
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            if(!findVowel(c)){
                st.append(c);
            }
        }
        return st.toString();
    }
    public static void main(String[] args) {
        String st=removeString("furqan");
        System.out.println(st);
    }
    public static boolean findVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ;
    }
}

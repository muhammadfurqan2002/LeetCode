import java.util.HashMap;

class  LengthOfLongestSubstring{
    public static int lengthOfLongestSubstring(String s) {
     int left=0,right=0,max=0;
    HashMap<Character,Integer> map=new HashMap();
    char[] array=s.toCharArray();
     for(;right<s.length();right++){
        int prevIndex=map.getOrDefault(array[right],-1);
        if(prevIndex!=-1 && prevIndex>=left){
            int newMax=right-1-left+1;
            max=Math.max(max,newMax);
            
            left=prevIndex+1;
        }
        map.put(array[right],right);
     }   
        return Math.max(max,right-1-left+1);
    }
    public static void main(String[] args) {
        String s="abcadabb";
        System.out.println(lengthOfLongestSubstring(s));       
    }
}
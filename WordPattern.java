import java.util.HashMap;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
      String[] arr= s.split(" ");
      if(arr.length!=pattern.length()){
        return false;
      }
      HashMap<Character,String> map1=new HashMap();
      HashMap<String,Boolean> map2=new HashMap();
      for(int i=0;i<arr.length;i++){
        char c1=pattern.charAt(i);
        String c2=arr[i];
        if(map1.containsKey(c1)){
            if(!map1.get(c1).equals(c2)){
                return false;
            }
        }else{
            if(map2.containsKey(c2)){
                return false;
            }else{
                map1.put(c1,c2);
                map2.put(c2,true);
            }
        }
      }
      return true;
    }
    public static void main(String[] args) {
        WordPattern obj=new WordPattern();
        System.out.println(obj.wordPattern("abba", "dog cat cat dog"));
    }
}
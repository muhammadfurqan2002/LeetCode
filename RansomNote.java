
class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length()>magazine.length()) return false; 
        
        int[] count=new int[26];
        for(char c:magazine.toCharArray()){
            count[c-'a']++;
        }

        for(char c:ransomNote.toCharArray()){
            count[c-'a']--;
            if(count[c-'a']<0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        // Also can be implemented using HashMap
        String ransomNote = "aa", magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
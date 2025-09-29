package LeetCode.Strings;

import java.util.ArrayList;
import java.util.List;

public class WordsContaining {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            boolean isContain=words[i].contains(String.valueOf(x));
            if(isContain){
                list.add(i);
            }
        }
    
        return list;
    }

    public static void main(String[] args) {
       String[] words = {"abc","bcd","aaaa","cbc"};
        System.out.println(findWordsContaining(words, 'a'));
    }


}

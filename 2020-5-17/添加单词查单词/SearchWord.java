package day09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author sofency
 * @date 2020/5/17 22:57
 * @package IntelliJ IDEA
 * @description
 */
public class SearchWord {
    HashMap<Integer,HashSet<String>> map = new HashMap<>();

    public void addWord(String word){
        int length = word.length();
        map.putIfAbsent(length,new HashSet<String>());
        map.get(length).add(word);
    }

    public boolean search(String word){
        int length = word.length();
        long count = map.get(length).stream().filter(string -> equal(word, string)).count();
        if(count>0){
            return true;
        }else{
            return false;
        }
    }

    public boolean equal(String word1,String word2){
        for(int i=0;i<word1.length();i++){
            if(word1.charAt(i)==word2.charAt(i)||word1.charAt(i)=='.'||word2.charAt(i)=='.'){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}

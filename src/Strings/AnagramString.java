package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "asar";
        String s2 = "asat";
        
        Map<Character,Integer> map = new HashMap();
        if(s1.length()!=s2.length()){
            System.out.println("False");
            return;
        }
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
        }
        Set<Character> set = map.keySet();
        for(Character a:set){
            System.out.println(a +" "+map.get(a));
        }
    }
}
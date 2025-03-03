package PlacementPractice.CommonQuestions;

import java.util.Arrays;
import java.util.List;

public class ReverseWords {
    static public String reverseWords(String s) {
        List<String> li = Arrays.asList(s.trim().split("\\s+"));
        String ans = "";
        for(int i=li.size()-1;i>=0;i--){
            ans+=li.get(i);
            if(i!=0)
                ans+=" ";
        }
        return ans;
    }

    public static void main(String[] args) {
        String ans = reverseWords("  hello  world  ");
        System.out.println(ans);
    }
}
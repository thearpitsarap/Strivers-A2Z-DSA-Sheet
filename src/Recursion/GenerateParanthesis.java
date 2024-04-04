package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> s =  new ArrayList<>();
        generate(s,"",0,0,n);
        return s;
    }

    public static void generate(List<String> s,String c,int close,int open,int max){
        if(c.length()==2*max){
            s.add(c);
            return;
        }
        if(open<max){
            generate(s,c+"(",close,open+1,max);
        }
        if(close<open){
            generate(s,c+")",close+1,open,max);
        }
    }

    public static void main(String[] args) {
        List<String> s = generateParenthesis(3);
        System.err.println(s);
    }
}
package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class  SuperiorElements {
    public static List< Integer > superiorElements(int []a) {
        ArrayList<Integer> li = new ArrayList<>();
        boolean flag = true;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[i]){
                    flag=false;
                    break;
                }
            }
            if(flag==true && !li.contains(a[i])){
                li.add(a[i]);
            }
            flag=true;
        }
        li.add(a[a.length-1]);
        return li;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,2,1};
        System.out.println(superiorElements(nums));
    }
}

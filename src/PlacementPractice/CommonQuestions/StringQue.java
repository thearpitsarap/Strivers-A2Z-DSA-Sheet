package PlacementPractice.CommonQuestions;

public class StringQue {
    public static void main(String[] args) {
        String s = "abbbbabbbbbbbb";
        int c = 0;
        String[] arr = s.split("a");
        for(int i=1;i<arr.length;i++){
            if(arr[i].length()==4 || arr[i].length()==8){
                c+=1;
            }
        }
        System.out.println(c);
    }
}
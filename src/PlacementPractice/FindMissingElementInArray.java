package PlacementPractice;

public class FindMissingElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = arr.length+1;

        int asum = n*(n+1)/2;
        int sum = 0;

        for(int a:arr){
            sum+=a;
        }
        System.out.println(asum-sum);
    }
}
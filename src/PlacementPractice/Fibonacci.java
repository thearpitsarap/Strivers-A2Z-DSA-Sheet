package PlacementPractice;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print(0 + " " + 1 + " " + 1 + " ");
        int t1 = 1;
        int t2 = 1;
        for (int i = 3; i < 10; i++) {
            int m = t1 + t2;
            System.out.print(m + " ");
            t2 = t1;
            t1 = m;
        }
    }
}
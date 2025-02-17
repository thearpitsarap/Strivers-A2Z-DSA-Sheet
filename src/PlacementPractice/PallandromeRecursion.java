package PlacementPractice;

public class PallandromeRecursion {
    static int rev(int n, int temp) {
        if (n == 0) {
            return temp;
        }
        temp = (temp * 10) + (n % 10);
        return rev(n / 10, temp);
    }

    public static void main(String[] args) {
        int n = 1231;
        int revNum = rev(n, 0);
        if (revNum == n) {
            System.out.println("Palandrome");
        } else {
            System.out.println("Not Palandrome");
        }
    }
}
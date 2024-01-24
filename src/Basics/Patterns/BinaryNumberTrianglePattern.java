package Basics.Patterns;

public class BinaryNumberTrianglePattern {
    public static void nBinaryTriangle(int n) {
        int t1 = 0;
        int t2 = 0;
        for (int i = 0; i < n; i++) {
        if (t1 == 0) {
            t1 = 1;
        } else if (t1 == 1) {
            t1 = 0;
        }
        System.out.print(t1);
        for (int j = 0; j < i; j++) {
            if (t2 == 0) {
            t2 = 1;
            } else if (t2 == 1) {
            t2 = 0;
            }
            System.out.print(t2+"");
        }
        if (t1 == 0) {
            t2 = 1;
        } else {
            t2 = 0;
        }

        System.out.println();
        }
    }

    public static void main(String args[]){
        nBinaryTriangle(7);
    }
}

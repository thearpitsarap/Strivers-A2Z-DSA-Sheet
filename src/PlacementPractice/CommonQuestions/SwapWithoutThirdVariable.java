package PlacementPractice.CommonQuestions;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = -15;
        int b = 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
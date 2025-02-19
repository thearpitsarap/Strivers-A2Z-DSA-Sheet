package PlacementPractice;

class InnerNewT {
    public final void some(){
        System.out.println("One");
    }
}

public class NewT extends InnerNewT{
    public void some1(){
        System.out.println("Two");
    }

    public static void main(String[] args) {
        Double d1 = 200.0;
        Double d2 = 200.0;

        System.out.println(d2==d1);
    }
}
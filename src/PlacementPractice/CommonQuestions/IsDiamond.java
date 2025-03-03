package PlacementPractice.CommonQuestions;

class Parent {
    public void display(){
        System.out.println("Parent");
    }
}

interface MyInterface {
    default public void display(){
        System.out.println("Inter");
    }
}

class IsDiamond1 extends Parent implements MyInterface{
    @Override
    public void display(){
        System.out.println("IsDiamond");
    }
}

public class IsDiamond{

    public static void main(String[] args) {
        IsDiamond1 parent = new IsDiamond1();
        parent.display();

        
    }
}
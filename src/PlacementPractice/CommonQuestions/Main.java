package PlacementPractice.CommonQuestions;

class Parent {
    void show() {
        System.out.println("Parent's static show method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child's static show method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Reference is of Parent, but object is of Child
        obj.show(); // Calls Parent's show() because it's static
    }
}

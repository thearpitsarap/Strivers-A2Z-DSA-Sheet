package PlacementPractice;

class Parent{
    private int var1;
    private String var2;

    Parent(){}

    Parent(int v1,String  v2){
        this.var1=v1;
        this.var2=v2;
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }
}

class TestingInheritance extends Parent{
    int var3;
    String var4;

    TestingInheritance(){}

    TestingInheritance(int pv1,String pv2,int cv1,String cn2){
        super(pv1,pv2);
        this.var3=cv1;
        this.var4=cn2;
    }

    @Override
    public String toString() {
        return "TestingInheritance [var1=" + super.getVar1() + ", var2=" + super.getVar2() + ", var3=" + var3 + ", var4=" + var4 + "]";
    }
}

public class InnerTestingInheritance {
    public static void main(String[] args) {
        Parent obj = new TestingInheritance(1,"Parent",2,"Child");
        System.out.println(obj);
    }
}
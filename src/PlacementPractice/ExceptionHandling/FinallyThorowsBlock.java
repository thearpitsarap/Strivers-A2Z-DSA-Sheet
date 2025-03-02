package PlacementPractice.ExceptionHandling;

public class FinallyThorowsBlock {

    public static void display(){
        try {
            throw new RuntimeException("Some");
        } 
        catch(Exception e){
            System.out.println(e.getMessage());
            throw new NullPointerException("Some1");
        }
        finally{
            //this exception will be caught in main method's catch block
            throw new RuntimeException("Some2");
        } 
    }

    public static void main(String[] args) {
       try {
        display();
       } catch (Exception e) {
        System.out.println(e.getMessage());
       }
    }
}
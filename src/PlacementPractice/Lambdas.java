package PlacementPractice;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Greeting{
    void sayHello();
}

public class Lambdas {
    public static void main(String[] args) {
        Greeting gt = ()->System.out.println("Hello");
        // gt.sayHello();;

        Consumer<Integer> cx = (num) -> System.out.println("Consumer Called " + num);
        // cx.accept(23);

        Supplier<Integer> sx = () -> 12;
        // System.out.println(sx.get());

        Function<Integer,Integer> fx = (num)->num*2;
        // System.out.println(fx.apply(90));

        Predicate<String> px = (val)->val.equals("Value");
        // System.out.println(px.test("Value"));

        Optional<String> ox = null;
        // System.out.println(ox);

        String s1 = "Arpit";
        String s2 = new String("Arpit");
        
        StringBuilder sb = new StringBuilder("Arpit");
        StringBuilder sb1 = new StringBuilder("Arpit");
        System.out.println(sb.equals(sb1));

        // System.out.println(s1==s2);
        // System.out.println(s1.equals(s2));
    }
}
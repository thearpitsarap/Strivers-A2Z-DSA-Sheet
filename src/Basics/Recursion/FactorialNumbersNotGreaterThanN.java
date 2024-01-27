package Basics.Recursion;

import java.util.ArrayList;
import java.util.List;

public class FactorialNumbersNotGreaterThanN {
    public static List<Long> factorialNumbers(long n) {
        List<Long> list = new ArrayList<>();
        findFactorials(list, n, 1);
        return list;
    }

    static void findFactorials(List<Long> list, long n, long currentFactorial) {
        if (currentFactorial > n) {
            return;
        }

        list.add(currentFactorial);
        findFactorials(list, n, currentFactorial * (list.size() + 1));
    }

    public static void main(String[] args) {
        System.out.println(factorialNumbers(7));
    }
}

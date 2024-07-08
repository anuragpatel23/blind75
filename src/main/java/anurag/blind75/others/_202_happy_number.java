package anurag.blind75.others;

import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Stream;

public class _202_happy_number {

    public static void main(String... args){
        boolean res=isHappy(19);
        System.out.println("19 is a Happy number: "+res);
    }

    private static boolean isHappy(int n) {
    HashSet<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
        seen.add(n);
        n = getNextHappyNumber(n);
    }
        return n == 1;

}

    private static int getNextHappyNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}

package anurag.blind75.dynamic_programming;

public class _1_climbing_stairs {
    public static void main(String... args){
        int n=8;
        int result=climbStairs(n);
        System.out.println("number of ways in which we can climb "+n+" stairs is ::: "+result);
    }

    private static int climbStairs(int n){
        if(n==1)
            return 1;

        int one=1;
        int two=2;
        for(int i=3;i<=n; i++){
            int total=one+two;
            one=two;
            two=total;
        }

        return two;
    }
}

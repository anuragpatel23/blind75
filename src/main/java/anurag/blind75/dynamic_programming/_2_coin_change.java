package anurag.blind75.dynamic_programming;

import java.util.Arrays;

public class _2_coin_change {
    public static void main(String... args){
        int[] coins={1,2,5};
        int amount=11;
        int result = coinChange(coins, amount);
        System.out.println("coins needed :"+result);
    }

    private static int coinChange(int[] coins, int amount){
        int[] resultAmount= new int[amount+1];
        Arrays.fill(resultAmount, amount+1);

        resultAmount[0]=0;
        for(int i=1; i<=amount; i++){
            for(int j=0; j<coins.length; j++){
                if(i >= coins[j]){
                    resultAmount[i]= Math.min(resultAmount[i], 1+resultAmount[i-coins[j]]);
                }
            }
        }

        if(resultAmount[amount] < amount+1)
            return resultAmount[amount];

        return -1;
    }
}

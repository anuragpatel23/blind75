package anurag.blind75.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _2_best_time_to_buy_and_sell_stock {
    public static void main(String... args){
        int[] prices = {7,1,5,3,6,4};
        int bestProfit = maxProfit(prices);
        System.out.println(bestProfit);
    }

//    public static int maxProfit(int[] prices){
//        int diff=0;
//        for(int i=0;i<prices.length;i++){
//            for(int j=i+1; j<prices.length;j++){
//                int profit=prices[j]-prices[i];
//                if(profit>diff){
//                    diff=profit;
//                }
//            }
//        }
//        return diff;
//    }

    public static int maxProfit(int[] prices){
        int min=prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]<min)
                min = prices[i];

            profit = Math.max(profit, prices[i]-min);
        }

        return profit;
    }
}

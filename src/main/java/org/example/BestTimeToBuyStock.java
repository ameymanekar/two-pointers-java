package org.example;

public class BestTimeToBuyStock {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE; // Track minimum price
        int maxProfit = 0; // Track maximum profit

        for (int price : prices) {

            // Update minimum price if smaller price found
            if (price < minPrice) {
                minPrice = price;
            }

            // Calculate profit if sold today
            int profit = price - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        System.out.println("Maximum Profit: " + maxProfit(prices));
    }
}

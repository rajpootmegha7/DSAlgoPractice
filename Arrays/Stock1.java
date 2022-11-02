/**
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:
*/



class Solution {
    public int maxProfit(int[] prices) {
        int res = onePass(prices);
        return res;
    }
    // O(n) time complexity for this solution.
    public int onePass(int[] prices){
        int min = prices[0]; // Assign first val as min
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > min){  // compare all the other values to min
                profit = Math.max(profit, prices[i] - min);
            } else min = prices[i];
            
        }
        return profit;
    }
    //O(n^2) time complexity for this solution.  
    public int bruteForce(int [] prices){
        int profit = 0;
        
        for(int i = 0; i < prices.length; i++){
            for (int j = 1; j < prices.length - 1; j++){
                if(prices[j] > prices[i]){
                    profit = Math.max(profit, prices[j] - prices[i]);
                } else continue;
            }
        }
        return profit;
    }
}

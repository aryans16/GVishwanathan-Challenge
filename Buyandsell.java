public class Buyandsell {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {7,1,5,3,6,4};
        int result = sol.maxProfit(prices);
        System.out.println(result);
    }
    
}

class Solution{
    public int maxProfit(int[] prices){
        int minprice = prices[0];
        int maxProfit = 0;

        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }
            else{
                int profit = prices[i] - minprice;
                maxProfit = Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
}
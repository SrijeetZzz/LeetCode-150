public class BuySellStocks1 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int answer = maxProfit(prices);
        System.out.println(answer);
    }
    public static int maxProfit(int[] prices) {
        int j=0;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<=prices[j]){
                j=i;
            }
            else{
                int profit = prices[i]-prices[j];
                if(maxprofit<profit){
                    maxprofit=profit;
                }
            }
        }
        return maxprofit;
    }
}

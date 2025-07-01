class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
       
        int max=0;
        int min = prices[0];
        for(int i=0; i<n; i++){
            if(prices[i]<min){
                min  = prices[i];
            }else{

            
            max = Math.max(prices[i]-min, max);
            }
        }
        return max;
        
    }
}
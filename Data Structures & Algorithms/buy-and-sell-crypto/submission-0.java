class Solution {
    public int maxProfit(int[] prices) {
        int m=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[j]){
                    m=Math.max(m,prices[j]-prices[i]);
                }
            }
        }
        return m;
    }
}

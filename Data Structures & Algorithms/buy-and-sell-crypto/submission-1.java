class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] maxPrice = new int[n];
        int rightMax = 0;
        for (int i = n - 1; i >= 0; i--) {
            rightMax = Math.max(rightMax, prices[i]);
            maxPrice[i] = rightMax;
        }
        int maxValue = 0;
        for (int j = 0; j < n - 1; j++) {
            int currDiff = maxPrice[j] - prices[j];
            maxValue = Math.max(maxValue, currDiff);
        }
        return maxValue;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int max = -1;
        int res = 0;
        for(int i=prices.length-2;i>=0;i--){
            max = Math.max(max,prices[i+1]);
            res = Math.max(Math.max(max,prices[i+1])-prices[i],res);
        }
        return res;
    }
}
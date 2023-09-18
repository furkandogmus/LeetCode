class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int max = -1;
        int[] ar = new int[prices.length];
        ar[prices.length-1] = -1;
        int res = 0;
        for(int i=prices.length-2;i>=0;i--){
            ar[i] = Math.max(max,prices[i+1]);
            max = ar[i];
            res = Math.max(ar[i]-prices[i],res);
        }
        return res;
    }
}
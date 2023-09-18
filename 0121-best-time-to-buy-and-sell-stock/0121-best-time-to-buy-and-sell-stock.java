class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int max = -1;
        int[] ar = new int[prices.length];
        ar[prices.length-1] = -1;
        for(int i=prices.length-2;i>=0;i--){
            ar[i] = Math.max(max,prices[i+1]);
            max = ar[i];
        }
        max = 0;
        for(int i=0;i<prices.length;i++){
            max = Math.max(ar[i]-prices[i],max);
        }
        return max;
    }
}

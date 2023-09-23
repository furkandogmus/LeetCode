class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==2) return Math.min(cost[0],cost[1]);
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = cost[0];
        dp[1] = Math.min(dp[0]+cost[1],cost[1]);
        for(int i=2;i<=n;i++){
            if(i==n){dp[i] = Math.min(dp[i-1],dp[i-2]); break;}
            dp[i] = Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        return dp[n];
        
    }
}
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum%2!=0) return false;
        sum /=2;
        int n = nums.length;
        boolean[] prev = new boolean[sum+1];
  
 
        for (int i = 1; i <= sum; i++){
            prev[i] = false;
        }
    
         
      
        for (int i = 1; i <= n; i++) {
              boolean[] curr = new boolean[sum + 1];
            for (int j = 1; j <= sum; j++) {
                if(j==nums[i-1]) curr[j] = true;
                if (j < nums[i - 1])
                    curr[j] = prev[j];
                if (j > nums[i - 1])
                    curr[j] = prev[j] || prev[j - nums[i - 1]];
            }
        prev = curr;
    }
 
    return prev[sum];
        
        
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        
        int best = -123123;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = Math.max(nums[i],sum+nums[i]);
            best = Math.max(best,sum);
            }
        return best;

    }
    }

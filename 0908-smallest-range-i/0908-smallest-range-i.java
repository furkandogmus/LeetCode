class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
            if(nums[i]>max) max=nums[i];
        }
        if(min+2*k>=max) return 0;
        return max-min-2*k;
    }
}
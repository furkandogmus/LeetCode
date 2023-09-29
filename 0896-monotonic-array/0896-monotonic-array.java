class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1) return true;
        boolean increase=false,decrease=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){increase=true;}
            else if(nums[i-1]>nums[i]){decrease=true;}
            
        }
        if(decrease && increase ) return false;
        return true;
    }
}
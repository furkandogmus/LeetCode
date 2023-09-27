class Solution {
    public int[] searchRange(int[] nums, int target) {
     
        int l=-1,r=-1;
        for(int i=0;i<nums.length;i++){
            if(l==-1 && nums[i]==target) l=i;
            if(l!= -1 && nums[i]==target) r=i;
        }
        return new int[]{l,r};
    }
}
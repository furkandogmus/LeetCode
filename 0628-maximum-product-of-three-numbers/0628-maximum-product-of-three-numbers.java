class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int x = nums[nums.length-1];
        int y = nums[nums.length-2];
        int z = nums[nums.length-3];
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        if(a<0 && b<0){
            return Math.max(x* Math.max(a*b,z*y),x* Math.min(a*b,z*y));
        }
        return x*y*z;
        
    }
}
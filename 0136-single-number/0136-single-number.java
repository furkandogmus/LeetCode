class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        int total = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            if(!hs.contains(nums[i]))
                sum+= nums[i];
                hs.add(nums[i]);    
        
        }
    return 2*sum - total;
    }
    
}
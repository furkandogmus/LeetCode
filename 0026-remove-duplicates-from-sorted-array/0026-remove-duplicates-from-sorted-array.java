class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]) ar.add(nums[i]);
        }
        for(int i=0;i<ar.size();i++){
            nums[i] = ar.get(i);
        }
        return ar.size();
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int counter = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i] = 101;
                counter--;
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<counter;i++){
            System.out.print(nums[i] + " ");
        }
        return counter;
    }
}

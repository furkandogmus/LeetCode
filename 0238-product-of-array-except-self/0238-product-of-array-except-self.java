class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeros = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {zeros++;}
        }
        if(zeros>=2){
        Arrays.fill(nums,0);
        }
        else if(zeros==1){
            int product = 1;
            int zero_index = -1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    product *= nums[i];
                    nums[i] = 0;
                  
                }
                else{
                    zero_index = i;
                }
                
            }
            nums[zero_index] = product;
            
        }
        else {
            for(int i=1;i<nums.length;i++){
                nums[i]*= nums[i-1];
            }
            int first= nums[0];
            int last = nums[nums.length-2];
            int product = nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--){
                nums[i] = product / (nums[i]/nums[i-1]);
            }
            nums[0] = product / first;
           
        }
        return nums;
    }
}
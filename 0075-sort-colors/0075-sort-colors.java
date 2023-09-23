class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int blue = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) red++;
            if(nums[i]==2) blue++;
        }
        int index= 0;
        for(int i=0;i<nums.length;i++){
            if(red>0){
                nums[i]=0;
                red--;
            }else if(nums.length-blue>i){
                nums[i]=1;
            }else{
                nums[i] = 2;
            }
        }
        
    }
}
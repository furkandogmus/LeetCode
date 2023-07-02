class Solution {
    public int maxArea(int[] height) {
        int left = 0,right = height.length-1;
        int result = 0;
        while(left!=right){
            int mini = Math.min(height[left],height[right]);
            int temp = mini * (right-left);
            result = Math.max(result,temp);
            if(mini==height[left]) left++;
            else right--;
        }
        return result;
    }
}
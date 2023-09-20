class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = Integer.MAX_VALUE;
        while(left<=right){
            int mid = (left+right)/2;
            if(mid*mid == num){
                return true;
            }
            else if((long)mid*mid>num){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return false;
    }
}
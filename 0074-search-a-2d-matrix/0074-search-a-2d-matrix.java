class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length,n=matrix[0].length;
        int l=0, r=m;
        
        if(m==1 && n==1) return matrix[0][0]==target; 
        while(l<=r){
            int mid = (l+r)/2;
            if(mid>=m) break;
            if(matrix[mid][0]>target){
                r = mid-1;
            }else if(matrix[mid][n-1]<target){
                l= mid+1;
            }else{
                int left = 0;
                int right= n;
                while(left<=right){
                    int middle = (left+right)/2;
                    if(matrix[mid][middle]==target) return true;
                    else if(matrix[mid][middle]>target){
                        right= middle-1;
                    }else{
                        left= middle+1;
                    }
                }
                if(left>right) return false;
            }
        }
        return false;
    }
}
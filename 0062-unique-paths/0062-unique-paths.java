class Solution {
    public int uniquePaths(int m, int n) {
        return combination(m+n-2,m-1);
    }
    
    public int combination(int n, int k){
        if(k==0 || k==n) return 1;
        if(k==1 || k+1==n) return n;
        int r = Math.min(n-k,k);
        double result = 1.0;
        int i = 1;
        while(i<=r){
            result = result * n;
            result/=i;
            n--;
            i++;
            
        }
        
        return (int)(result);
    }
}
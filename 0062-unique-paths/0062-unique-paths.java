class Solution {
    public int uniquePaths(int m, int n) {
        return combination(m+n-2,m-1);
    }
    
    public int combination(int n, int k){
        if(k==0 || k==n) return 1;
        if(k==1 || k+1==n) return n;
        int r = Math.min(n-k,k);
        double result = 1.0;
        int x=n;
        while(r>0){
            result = result * n;
            result/=(Math.min(x-k,k) -r+1);
            
            n--;
            r--;
            
        }
        
        return (int)(result);
    }
}
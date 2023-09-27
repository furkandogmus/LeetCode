class Solution {
    public int findNthDigit(int n) {
        if(n<9) return n;
        int i =1;
        long j = 9L;
        while(n>j){
            n-=j;
            i++;
            j= 9*i*(long)Math.pow(10,i-1);
        }
        if(n==0) return 9;
        int a = (n-1)/i;
        int b = (n-1) %i;
        long c = j / (i*9);
        long d = c + (long)a;
        
        
        return nthDigit(d,b);
    }
    
    
    public int nthDigit(long x,int y){
        int n= String.valueOf(x).length();
        y = n-y;
        while(y>1) {
            x = x/10;
            y--;
        }
        return (int)x%10;
    }
}
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==0) return 0;
        if(divisor==1) return dividend;
        if(dividend==Integer.MIN_VALUE && divisor ==-1 ) return Integer.MAX_VALUE;
        if(dividend==Integer.MIN_VALUE && divisor ==Integer.MIN_VALUE ) return 1;
        boolean isDividendPositive= false;
        if(dividend>0) {dividend*=-1;
                            isDividendPositive=true;}
        
            int result = -1;
            boolean isDivisorPositive= divisor>0;
            if(!isDivisorPositive){divisor*=-1;}
            while(dividend<=0){
                result++;
                dividend += divisor;
            }
            if((isDividendPositive && isDivisorPositive) ||(!isDividendPositive && !isDivisorPositive)){
                return result;
            }
            return -result;
        
        
    }
}
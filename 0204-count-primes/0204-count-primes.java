class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] primes = new boolean[n];
        Arrays.fill(primes,true);
        int total = n-2;
        primes[0] = false;
        primes[1] = false;
        for(int i=2;i<n;i++){
            if(!primes[i])total--;
            int x = 2;
            while(i*x<n){
                primes[i*x] = false;
                x++;
                
            }
        }
    return total;
    }
}
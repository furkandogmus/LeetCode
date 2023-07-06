class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] primes = new boolean[n];
        Arrays.fill(primes,true);
        primes[0] = false;
        primes[1] = false;
        for(int i=2;i<n;i++){
            int x = 2;
            while(i*x<n){
                primes[i*x] = false;
                x++;
            }
        }
        int total = 0;
        for(int i=0;i<n;i++){
            if(primes[i]) total++;
        }
        return total;
    }
}
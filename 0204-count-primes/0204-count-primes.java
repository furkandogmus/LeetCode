class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        int[] primes = new int[n];
        Arrays.fill(primes,1);
        primes[0] = 0;
        primes[1] = 0;
        for(int i=2;i<n;i++){
            if(primes[i]==0) continue;
            int x = 2;
            while(i*x<n){
                primes[i*x] = 0;
                x++;
            }
        }
        int total = 0;
        for(int i=0;i<n;i++){
            total += primes[i];
        }
        return total;
    }
}
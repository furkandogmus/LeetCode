class Solution {
    public String getPermutation(int n, int k) {
        if(n==1) return "1";
        String res = "";
        if(k==1){
            for(int i=1;i<=n;i++){
                res+=String.valueOf(i);
            }
            return res;
        }
        int a = n-1;
        List<Integer> ls = new ArrayList<>();
        for(int i=1;i<n+1;i++){
            ls.add(i);
        }
        k -=1;
        while(a>=0){
            int fact = factorial(a);
            res+=String.valueOf(ls.get(k/fact));
            ls.remove(k/fact);
            k= k%fact;
            a--;
            
        }
        
        
        return res;
    }
    
    public int factorial(int n){
        if(n<=1) return 1;
        int res= 1;
        for(int i=2;i<n+1;i++){
            res*=i;
        }
        return res;
    }
}
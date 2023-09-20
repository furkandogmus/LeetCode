class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        Set<Integer> set = new HashSet<>();
        return f(set,n);
    }
    
    public boolean f(Set<Integer> set, int x){
        if(x==1) {return true;}
        if(set.contains(x)) {return false;}
        set.add(x);
        int total = 0;
        while(x>0){
            total += Math.pow(x%10,2);
            x/=10;
        }
        return f(set,total);
    }
}
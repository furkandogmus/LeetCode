class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length()==1) return false;
        int n = s.length();
        int i,j;
        for(i=1;i<=n/2;i++){
            if(n%i == 0){
                StringBuilder pattern = new StringBuilder();
                for(j=0;j<n/i;j++){
                    pattern.append(s.substring(0,i));
                }
                if(s.equals(pattern.toString())) return true;
            }
        }

        return false;
    }
}
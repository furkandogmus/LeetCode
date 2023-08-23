class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length()==1) return false;
        int i,j;
        for(i=0;i<s.length()-1;i++){
            String pattern = s.substring(0,i+1);
          
            for(j=0;j<s.length()-i;j+=pattern.length()){
                if(!pattern.equals(s.substring(j,j+i+1))){break;}
            }
            if(j==s.length()){return true;}
        }

        return false;
    }
}
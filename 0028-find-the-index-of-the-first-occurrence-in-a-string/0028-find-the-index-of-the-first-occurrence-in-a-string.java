class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()< needle.length()) return -1;
        else if(haystack.length()==needle.length()){
            if(haystack.equals(needle)) return 0;
            return -1;
        }
        else {
            for(int i=0;i<haystack.length();i++){
                if(haystack.charAt(i)==needle.charAt(0)){
                    int j;
                    for(j=0;(j<needle.length() && i+j<haystack.length());j++){
                        if(haystack.charAt(i+j)!=needle.charAt(j)){break;}
                    }
                    if(j==needle.length()) return i;
                }
                
            }
            return -1;
        }
        
        
    }
}
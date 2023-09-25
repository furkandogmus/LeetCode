class Solution {
    public char findTheDifference(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int i=0;i<Math.min(s1.length,t1.length);i++){
            if(s1[i]!=t1[i]){
                if(s1.length>t1.length) return s1[i];
                return t1[i];
            }
        }
        if(s1.length>t1.length) return s1[s1.length-1];
        return t1[t1.length-1];
     }
}
class Solution {
    public int lengthOfLastWord(String s) {
        int last = 0;
        int result = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!= ' '){
                last++;
            }else{
                if(last!=0){
                result = last;
                }
                last= 0;
            }
            
        }
        if(last!=0){
                result = last;
        }
        
        return result;
    }
}
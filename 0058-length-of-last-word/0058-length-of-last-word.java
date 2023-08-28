class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(result==0){
                if(s.charAt(i) != ' ') result++;
            }else{
                if(s.charAt(i) == ' ') return result;
                result++;
            }
        }
    return result;
    }
  
}
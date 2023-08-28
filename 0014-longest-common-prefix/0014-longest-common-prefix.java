class Solution {
    public String longestCommonPrefix(String[] strs) {
    StringBuilder sb = new StringBuilder();
        for(int i =0;i<strs[0].length();i++){
            sb.append(strs[0].charAt(i));
            for(String str : strs){
                if(i==str.length() || str.charAt(i)!= sb.charAt(i)){
                    sb.deleteCharAt(sb.length()-1);
                    return sb.toString();
                }
            }
            
        }
        return sb.toString();
    }
}
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> hm = new HashMap<>();
        Map<String,Character> hm1 = new HashMap<>();
		String[] sArr = s.split(" ");
		if(sArr.length!=pattern.length()) return false;
        for(int i=0;i<sArr.length;i++) {
			if(hm.containsKey(pattern.charAt(i))) {
				if(!sArr[i].equals(hm.get(pattern.charAt(i)))) {
					return false;
				}
			}else{
                hm.put(pattern.charAt(i), sArr[i]);
            
            }
		}
        for(int i=0;i<sArr.length;i++) {
			if(hm1.containsKey(sArr[i])) {
				if(pattern.charAt(i)!=hm1.get(sArr[i])) {
					return false;
				}
			}else{
                hm1.put(sArr[i], pattern.charAt(i));
            }
		}
		return true;
    }
}
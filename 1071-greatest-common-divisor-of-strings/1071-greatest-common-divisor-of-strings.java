class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.charAt(0)!=str2.charAt(0)) return "";
        StringBuilder res = new StringBuilder();
        String result = "";

        if(str1.length()<str2.length()){
            String temp = str1;
            str1= str2;
            str2 = temp;
        }
        for(int i=0;i<str2.length();i++){
            res.append(str2.charAt(i));
            StringBuilder control = new StringBuilder(res.toString());
            if(str1.length()%control.length()!=0) continue;
            while(control.length()<str1.length()){
                control.append(res.toString());
            }
            StringBuilder control2 = new StringBuilder(res.toString());
            if(str2.length()%control2.length()!=0) continue;
            while(control2.length()<str2.length()){
                control2.append(res.toString());
            }
            if(control.toString().equals(str1) && control2.toString().equals(str2)){
                result = res.toString();
            }


        }
        return result;
    }
}

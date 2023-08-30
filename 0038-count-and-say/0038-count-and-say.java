class Solution {

    public String count(String n){
        if(n.length()==1){
            return "1"+n;
        }
        int counter = 0;
        StringBuilder text= new StringBuilder();
        for(int i = 0; i< n.length()-1; i++) {
            if(n.charAt(i)!= n.charAt(i+1)){
                text.append(counter+1);
                text.append(n.charAt(i));
                counter= 0;
            }else{
                counter++;
            }
        }
        if(counter!= 0){
          text.append(counter+1);
          text.append(n.charAt(n.length()-1));
        }else if(n.length()>=2 && n.charAt(n.length()-1) != n.charAt(n.length()-2)){
            text.append(1);
            text.append(n.charAt(n.length()-1));
        }


        return text.toString();
    }
    public String countAndSay(int n) {
        String result = "1";
        for(int i=1;i<n;i++){
            result = count(result);

        }
        return String.valueOf(result);

    }

}
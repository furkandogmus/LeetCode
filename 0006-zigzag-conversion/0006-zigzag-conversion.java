class Solution {
    public String convert(String text, int n) {
          if(n==1) {
            return text;
        }
        ArrayList<ArrayList<Character>> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(new ArrayList<>());
        }
        int index = 0;
        boolean reverse = false;
        for(int i=0;i<text.length();i++){
            arr.get(index).add(text.charAt(i));
            index = reverse ? index-1 : index+1;
            if(index==0){
                reverse = false;
            } else if(index==n-1){
                reverse = true;
            }


        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<arr.get(i).size();j++){
                result.append(arr.get(i).get(j));
            }
        }
        return result.toString();
    }
}
class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<String>();
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");

        ArrayList<String> res = new ArrayList<>();
        if(digits.length()==1){
            for(int i=0;i<hm.get(Integer.valueOf(digits)).length();i++){
                res.add(String.valueOf(hm.get(Integer.valueOf(digits)).charAt(i)));
            }
        }
        else if(digits.length() == 2){
            for(int i=0;i<hm.get(digits.charAt(0)-48).length();i++){
                for(int j=0;j<hm.get(digits.charAt(1)-48).length();j++){
                        String comb = String.valueOf(hm.get(digits.charAt(0)-48).charAt(i))
                                +String.valueOf(hm.get(digits.charAt(1)-48).charAt(j));
                        res.add(comb);

                    }
                }
        }else if(digits.length()==3){
            for(int i=0;i<hm.get(digits.charAt(0)-48).length();i++){
                for(int j=0;j<hm.get(digits.charAt(1)-48).length();j++){
                    for(int k=0;k<hm.get(digits.charAt(2)-48).length();k++){
                        String comb = String.valueOf(hm.get(digits.charAt(0)-48).charAt(i))
                                +String.valueOf(hm.get(digits.charAt(1)-48).charAt(j))
                                +String.valueOf(hm.get(digits.charAt(2)-48).charAt(k));
                        res.add(comb);

                    }


                }
            }
        }else if(digits.length()==4){
            for(int i=0;i<hm.get(digits.charAt(0)-48).length();i++){
                for(int j=0;j<hm.get(digits.charAt(1)-48).length();j++){
                    for(int k=0;k<hm.get(digits.charAt(2)-48).length();k++){
                        for(int l=0;l<hm.get(digits.charAt(3)-48).length();l++){
                            String comb = String.valueOf(hm.get(digits.charAt(0)-48).charAt(i))
                                    +String.valueOf(hm.get(digits.charAt(1)-48).charAt(j))
                                    +String.valueOf(hm.get(digits.charAt(2)-48).charAt(k))
                                    +String.valueOf(hm.get(digits.charAt(3)-48).charAt(l));
                            res.add(comb);

                        }

                    }


                }
            }
        }




        return res;
    }
}

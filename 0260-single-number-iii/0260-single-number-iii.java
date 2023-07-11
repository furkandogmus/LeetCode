class Solution {
    public int[] singleNumber(int[] nums) {
                        
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> ar = new ArrayList<>();
        for(int num: hm.keySet()){
            if(hm.get(num)==1){
                ar.add(num);
            }
        }
        int[] res = new int[ar.size()];
        for(int i=0;i<ar.size();i++){
            res[i] = ar.get(i);
        }
        return res;
    }
}
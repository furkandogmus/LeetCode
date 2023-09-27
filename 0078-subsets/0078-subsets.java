class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            List<Integer> ar = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j)) >0 ){
                    ar.add(nums[j]);
                    
                }
            }
            ls.add(ar);
        }
        return ls;
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        List<Integer> ls = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i=1;i<nums.length+1;i++){
            if(!hs.contains(i)) ls.add(i);
        }
        return ls;
    }
}
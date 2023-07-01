class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] temp = new int[nums.length];
        Arrays.fill(temp,0);
        List<Integer> ls = new ArrayList<Integer>();
        
        for(int i=1;i<nums.length+1;i++){
            temp[nums[i-1]-1] = 1;
        }
        for(int i=1;i<nums.length+1;i++){
            if(temp[i-1]==0) ls.add(i); 
        }
        return ls;
    }
}
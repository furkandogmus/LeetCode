class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                ar.add(nums[i]);
            }
        }

        int counter=1,max=0;
        for(int i=0;i<ar.size()-1;i++){
            if(ar.get(i)+1==ar.get(i+1)){
                counter++;
            }else{
                max = Math.max(counter,max);
                counter = 1;
            }
        }
        max = Math.max(counter,max);
        return max;
    }
}
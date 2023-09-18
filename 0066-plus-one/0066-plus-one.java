class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length-1;

        while(index>-1 && digits[index]==9){
            digits[index] = 0;
            index--;
        }
        if(index==-1){
            int[] res = new int[digits.length+1];
            Arrays.fill(res,0);
            res[0] = 1;
            return res;
        }
        digits[index]++;
        return digits;
    }
}
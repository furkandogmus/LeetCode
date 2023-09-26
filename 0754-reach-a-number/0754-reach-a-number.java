class Solution {
    public int reachNumber(int target) {
        if (target < 0) target = -target; 
        int x = (int) Math.ceil((-1 + Math.sqrt(1 + 8L * target)) / 2);
        long sum = (long) x * (x + 1) / 2;

        if (sum == target) return x;

        int res = (int) (sum - target);

        if (res % 2 == 0) return x;
        if (x % 2 == 0) return x + 1;
        return x + 2;
    }

}


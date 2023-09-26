class Solution {
   public int reachNumber(int target) {
        target = Math.abs(target);
        long n = (long) Math.ceil((-1.0 + Math.sqrt(1 + 8.0 * target)) / 2);
        long sum = n * (n + 1) / 2;
        if (sum == target) {
            return (int) n;
        }
        long res = sum - target;
        if ((res & 1) == 0) {
            return (int) n;
        } else {
            return (int) (n + ((n & 1) == 1 ? 2 : 1));
        }
}
}


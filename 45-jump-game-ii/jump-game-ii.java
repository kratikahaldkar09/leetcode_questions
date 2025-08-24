class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;   // already at the end
        if (nums[0] == 0) return -1; // can't move anywhere

        int jumps = 1;   // we start with first jump
        int maxReach = nums[0]; // max index we can reach
        int steps = nums[0];    // steps left in current jump

        for (int i = 1; i < n; i++) {
            // reached the end
            if (i == n - 1) return jumps;

            // update maxReach
            maxReach = Math.max(maxReach, i + nums[i]);
            steps--;

            if (steps == 0) { // no more steps left
                jumps++;
                if (i >= maxReach) return -1; // can't go further
                steps = maxReach - i; // reinitialize steps
            }
        }
        return -1;
    }
}
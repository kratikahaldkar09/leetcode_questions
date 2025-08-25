class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        // Initialize first and last index
        int first = -1, last = -1;

        for (int i = 0; i < n; i++) {
            // If target is different, continue
            if (target != nums[i])
                continue;

            // If first occurrence found
            if (first == -1)
                first = i;

            // Update last occurrence
            last = i;
        }

        return new int[]{first, last}; 
    }
}
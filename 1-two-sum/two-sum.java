class Solution {
    public int[] twoSum(int[] nums, int target) {
        // two sum
        int i, j, m;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                m = nums[i] + nums[j];
                if (m == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }
}
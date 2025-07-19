class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find the first decreasing element from the right
        // (i.e., find the largest index k such that nums[k] < nums[k + 1])
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // If such an element exists (i >= 0)
        if (i >= 0) {
            // Step 2: Find the smallest element to the right of nums[i] that is greater than nums[i]
            // (i.e., find the largest index l such that nums[l] > nums[k])
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Step 4: Reverse the subarray from index i + 1 to the end
        // This ensures the suffix is in ascending order, making it the lexicographically smallest
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
    

class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0]; 
        int minProduct = nums[0];
        int answer = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            int currentMax = maxProduct;
            int currentMin = minProduct;

            maxProduct = Math.max(nums[i], Math.max(currentMax * nums[i], currentMin * nums[i]));
            minProduct = Math.min(nums[i], Math.min(currentMax * nums[i], currentMin * nums[i]));
            answer = Math.max(answer, maxProduct);
        }
        return answer;
      
    }
}
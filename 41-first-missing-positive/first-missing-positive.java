class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=1,i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==n &&nums[i]>=1){
                n++;
            }
        }
        return n;
    }
}
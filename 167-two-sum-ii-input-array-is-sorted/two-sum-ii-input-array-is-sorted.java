class Solution {
    public int[] twoSum(int[] numbers, int target) {
                int n=numbers.length;
        int i,j,m;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                    m=numbers[i]+numbers[j];
                    if(m==target){
                        return new int[] {i+1,j+1};
                    }
            }
            
        }
        return new int[0];
        
    }
}
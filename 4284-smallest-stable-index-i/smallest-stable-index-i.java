class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int StableIndex = -1;
        int min = Integer.MAX_VALUE;
        for(int i = nums.length-1; i >= 0; i--){
            min = Math.min(min,nums[i]);
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<=i; j++){
                max = Math.max(max,nums[j]);
            }
            if(max - min <= k){
                StableIndex = i;
            }
        }
        return StableIndex;
    }
}
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int StableIndex = -1;
        for(int i = nums.length-1; i >= 0; i--){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int a = 0; a<=i; a++){
                max = Math.max(max,nums[a]);
            }
            for(int b = i; b<nums.length; b++){
                min = Math.min(min,nums[b]);
            }
            if(max - min <= k){
                StableIndex = i;
            }
        }
        return StableIndex;
    }
}
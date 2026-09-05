class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int stableIndex = -1;
        int[] arr = new int[nums.length];

        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max,nums[i]);
            arr[i] = max;
        }

        int min = Integer.MAX_VALUE;
        for(int j=nums.length-1; j>=0; j--){
            min = Math.min(min,nums[j]);
            arr[j] = arr[j] - min;
            if(arr[j] <= k){
                stableIndex = j;
            }
        }
        return stableIndex;
    }
}
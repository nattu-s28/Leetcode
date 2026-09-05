class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int[] arr = new int[nums.length];

        int min = Integer.MAX_VALUE;
        for(int i=nums.length-1; i>=0; i--){
            min = Math.min(min,nums[i]);
            arr[i] = min;

        }
        int max = Integer.MIN_VALUE;
        for(int j=0; j<nums.length; j++){
            max = Math.max(max,nums[j]);
            arr[j] = max - arr[j];
            if(arr[j] <= k){
                return j;
            }
        }

        return -1;
    }
}
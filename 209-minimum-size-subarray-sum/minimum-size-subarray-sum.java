class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minsize = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int right=0; right<nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                minsize = Math.min(minsize,right - left + 1);
                sum -= nums[left++];
            }
        }
        return (minsize == Integer.MAX_VALUE) ? 0 : minsize;
    }
}
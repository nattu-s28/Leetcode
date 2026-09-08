class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int distance = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == target)
            {
                distance = Math.min(distance,Math.abs(i - start));
            }
        }
        return distance;
    }
}
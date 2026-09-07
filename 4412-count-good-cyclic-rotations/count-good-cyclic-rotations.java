class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        long sum1 = 0;
        long sum2 = 0;
        int mid = n/2;
        int goodRotations = 0;
        int countequals = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(i < mid)
            {
                sum1 += nums[i];
            }
            else
            {
                sum2 += nums[i];
            }
        }
        goodRotations += (sum1 > sum2) ? 1 : 0;
        for(int i=0; i<mid; i++)
        {
            sum1 = (sum1 - nums[i]) + nums[(mid+i)%n];
            sum2 = (sum2 - nums[(mid+i)%n]) + nums[i];
            goodRotations += (sum1 > sum2) ? 1 : 0;
            countequals += (sum1 == sum2) ? 1 : 0;
        }
        goodRotations += mid - goodRotations - countequals;
        return goodRotations;        
    }
}
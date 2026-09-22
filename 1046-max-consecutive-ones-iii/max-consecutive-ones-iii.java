class Solution {
    public int longestOnes(int[] nums, int k) {
        int MaxOnes = 0;
        int zcount = 0;
        for(int left=0,right=0; right<nums.length; right++){
            if(nums[right] == 0){
                zcount++;
            }
            while(zcount > k){
                if(nums[left] == 0){
                    zcount--;
                }
                left++;
            }
            MaxOnes = Math.max(MaxOnes,right-left+1);
        }
        return MaxOnes;
    }
}
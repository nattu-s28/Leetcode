class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int deletions = 0;
        if(n <= 2){
            return n;
        }
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < minimum){
                minimum = nums[i];
                minIndex = i;
            }
            if(nums[i] > maximum){
                maximum = nums[i];
                maxIndex = i;
            }
        }

        int deletions1 = Math.max(minIndex + 1,maxIndex + 1);
        int deletions2 = Math.max(n - minIndex,n - maxIndex);
        int deletions3 = Math.min(minIndex + 1,n - minIndex) + Math.min(maxIndex + 1,n - maxIndex);
        
        return Math.min(deletions3,Math.min(deletions1,deletions2));
    }
}
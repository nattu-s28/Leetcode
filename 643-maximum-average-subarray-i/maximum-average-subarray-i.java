class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Double.NEGATIVE_INFINITY;
        double sum = 0;
        double Avg = 0;
        for(int i=0,j=0; j<nums.length; j++){
            sum += nums[j];
            if(j >= k-1){
                Avg = Double.parseDouble(String.format("%.5f",(double)sum/k));
                sum -= nums[i++];
                maxAvg = Math.max(maxAvg,Avg);
            }
        }
        return maxAvg;
    }
}
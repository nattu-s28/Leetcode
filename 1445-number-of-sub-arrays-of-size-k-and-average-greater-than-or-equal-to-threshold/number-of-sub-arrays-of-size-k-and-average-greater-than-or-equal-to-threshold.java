class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        for(int i=0,j=0; j<arr.length; j++){
            sum += arr[j];
            if(j >= k-1){
                int mean = sum/k;
                if(mean >= threshold){
                    count++;
                }
                sum -= arr[i++];
            }
        }
        return count;
    }
}
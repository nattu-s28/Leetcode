class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int deletions = 0;
        if(n <= 2){
            return n;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        int minimum = Collections.min(list);
        int maximum = Collections.max(list);
        int minIndex = list.indexOf(minimum);
        int maxIndex = list.indexOf(maximum);

        //if(minIndex <= (n/2) && maxIndex <= (n/2)){
            int deletions1 = Math.max(minIndex + 1,maxIndex + 1);
        //}
        //else if(minIndex > (n/2) && maxIndex > (n/2)){
            int deletions2 = Math.max(n - minIndex,n - maxIndex);
        //}
        //else{
            int deletions3 = Math.min(minIndex + 1,n - minIndex) + Math.min(maxIndex + 1,n - maxIndex);
        //}
        return Math.min(deletions3,Math.min(deletions1,deletions2));
    }
}
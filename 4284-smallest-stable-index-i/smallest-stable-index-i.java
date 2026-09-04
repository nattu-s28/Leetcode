class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ss = -1;
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        for(int i=nums.length-1; i>=0; i--){
            List<Integer> maxsublist = list.subList(0,i+1);
            List<Integer> minsublist = list.subList(i,nums.length);
            int max = Collections.max(maxsublist);
            int min = Collections.min(minsublist);
            if(max - min <= k){
                ss = i;
            }
        }
        return ss;
    }
}
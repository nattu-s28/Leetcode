class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        boolean[] arr = new boolean[nums.length+1];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(arr[nums[i]] == true){
                list.add(nums[i]);
            }
            // [F,F,F,F,T,F,F,T]
            arr[nums[i]] = true;
        }
        return list;
    }
}
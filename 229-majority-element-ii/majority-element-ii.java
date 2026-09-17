class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length < 2){
            list.add(nums[0]);
            return list;
        }
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0; i<nums.length; i++){
            if(cnt1 == 0 && nums[i] != element2){
                cnt1 = 1;
                element1 = nums[i];
            }
            else if(cnt2 == 0 && nums[i] != element1){
                cnt2 = 1;
                element2 = nums[i];
            }
            else if(element1 == nums[i]) cnt1++;
            else if(element2 == nums[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int i=0; i<nums.length; i++){
            if(element1 == nums[i]) cnt1++;
            if(element2 == nums[i]) cnt2++;
        }
        if(cnt1 > nums.length/3){
            list.add(element1);
        }
        if(cnt2 > nums.length/3){
            list.add(element2);
        }
        return list;
    }
}
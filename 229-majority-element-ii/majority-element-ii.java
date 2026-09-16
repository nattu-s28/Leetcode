class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num : map.keySet()){
            if(map.get(num) > nums.length/3){
                list.add(num);
                if(list.size() == 2){
                    break;
                }
            }
        }
        return list;
    }
}
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        List<Integer> numsList1 = new ArrayList<>();
        List<Integer> numsList2 = new ArrayList<>();
        for(int i=0,j=0; i<100; j++,i++){
            if(i < nums1.length){
                numsList1.add(nums1[i]);
            }
            if(j < nums2.length){
                numsList2.add(nums2[j]);
            }
        }
        int cnt1 = 0;
        for(int num : numsList1){
            if(numsList2.contains(num)){
                cnt1++;
            }
        }
        int cnt2 = 0;
        for(int num : numsList2){
            if(numsList1.contains(num)){
                cnt2++;
            }
        }
        return new int[]{cnt1,cnt2};
    }
}
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] frequencycount = new int[1000];
        int idx = 0;
        int cnt = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                cnt++;
            }
            else{
                frequencycount[idx++] = cnt;
                cnt = 1;
            }
        }
        frequencycount[idx] = cnt;
        Arrays.sort(frequencycount);
        for(int i=0; i<frequencycount.length; i++){
            if(frequencycount[i] == 0){
                continue;
            }
            else if(i>0 && frequencycount[i] == frequencycount[i-1]){
                return false;
            }
        }
        return true;
    }
}
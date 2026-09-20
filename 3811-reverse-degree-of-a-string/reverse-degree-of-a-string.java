class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int pos = 1;
        for(char ch : s.toCharArray()){
            sum += ('z'+ 1 - ch) * pos;
            pos++;
        }
        return sum;
    }
}
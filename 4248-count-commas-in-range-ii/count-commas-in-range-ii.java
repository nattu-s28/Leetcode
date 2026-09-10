class Solution {
    public long countCommas(long n) {
        long commas = 0;
        
        for(long start = 1000; start <= n; start*=1000){
            commas += n - start + 1;
        }
        return commas;
    }
}
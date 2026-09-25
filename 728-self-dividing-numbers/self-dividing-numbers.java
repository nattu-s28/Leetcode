class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        while(left <= right){
            if(selfDivide(left)){
                list.add(left);
            }
            left++;
        }
        return list;
    }
    public boolean selfDivide(int num){
        int temp = num;
        while(temp != 0){
            int divisor = temp % 10;
            temp /= 10;
            if(divisor == 0){
                return false;
            }
            if(num % divisor != 0){
                return false;
            }
        }
        return true;
    }
}
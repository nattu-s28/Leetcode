class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> list = new ArrayList<>();
        long element = 1;
        for(int col=0; col<=rowIndex; col++){
            list.add((int)element);
            element = (element * (rowIndex - col)) / (col + 1);
        }
        return list;
    }
}
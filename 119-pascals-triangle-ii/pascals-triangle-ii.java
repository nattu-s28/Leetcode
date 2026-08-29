class Solution {
    public List<Integer> getRow(int rowIndex) {

        Integer[] list = new Integer[rowIndex+1];
        Arrays.fill(list,1);
        long element = 1;
        for(int col=1; col<rowIndex+1;col++){
            element *= rowIndex+1 - col;
            element /= col;
            list[col] = (int)element;
        }
        return Arrays.asList(list);
    }
}
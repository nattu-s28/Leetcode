class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            int element = 1;
            Integer[] temp = new Integer[row];
            Arrays.fill(temp,1);
            for(int col=1;col<row;col++){
                element *= row-col;
                element /= col;
                temp[col] = element;
            }
            list.add(Arrays.asList(temp));
        }
        return list;
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        
        List<int[]> list = new ArrayList<>();
        int[] cIn = intervals[0];
        list.add(cIn);

        for(int i=1; i<intervals.length; i++){
            int[] nIn = intervals[i];

            if(cIn[1] >= nIn[0]){
                cIn[1] = Math.max(cIn[1],nIn[1]);
            }
            else{
                cIn = nIn;
                list.add(cIn);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}
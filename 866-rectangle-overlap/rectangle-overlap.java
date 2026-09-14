class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = Math.max(rec1[0],rec2[0]);
        int x2 = Math.min(rec1[2],rec2[2]);
        int y1 = Math.max(rec1[1],rec2[1]);
        int y2 = Math.min(rec1[3],rec2[3]);
        long width = Math.max(0,x2 - x1);
        long height = Math.max(0,y2 - y1);
        long area = width * height;
        return (area > 0) ? true : false;
    }
}
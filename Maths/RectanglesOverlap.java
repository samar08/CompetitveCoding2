class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int lx1=rec1[0],ly1=rec1[1],lx2=rec1[2],ly2=rec1[3];
        int rx1=rec2[0],ry1=rec2[1],rx2=rec2[2],ry2=rec2[3];
        if(rx1>=lx2 || rx2<=lx1 || ry2<=ly1 || ry1>=ly2){
            return false;
        }
        return true;
    }
}
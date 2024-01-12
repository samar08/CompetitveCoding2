class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int Ax1=rec1[0], Ay1=rec1[1],Ax2=rec1[2],Ay2=rec1[3];
        int Lx1=rec2[0], Ly1=rec2[1], Lx2=rec2[2], Ly2=rec2[3];
        if(Ly1>=Ay2 || Ly2<=Ay1 || Lx1>=Ax2 || Lx2<=Ax1){
            return false;
        }
        return true;
        
    }
}
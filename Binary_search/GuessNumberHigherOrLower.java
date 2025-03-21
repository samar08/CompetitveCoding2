/*
* 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int lower=0;
        int higher=0;
        int mid=0;
        int res=guess(n);
        if(res==0){
            return n;
        }
        else if(res==-1){
            lower=1;
            higher=n-1;
            while(lower<=higher){
                mid=lower+(int)(higher-lower)/2;
                int out=guess(mid);
                if(out==0){
                    return mid;
                }
                else if(out==-1){
                    higher=mid-1;
                }
                else{
                    lower=mid+1;
                }
            }
        }
        else{
            lower=n+1;
            higher=(int)Math.pow(2,31)-1;
            while(lower<=higher){
                mid=lower+(int)(higher-lower)/2;
                int out=guess(mid);
                if(out==0){
                    return mid;
                }
                else if(out==-1){
                    higher=mid-1;
                }
                else{
                    lower=mid+1;
                }
            }
        }

        return 0;
    }
}
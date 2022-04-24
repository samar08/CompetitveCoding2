public class Solution {
    public int checkBit(int pattern,ArrayList<Integer>arr, int n)
{
    int count = 0;
    for (int i = 0; i < n; i++)
        if ((pattern & arr.get(i)) == pattern)
            count++;
    return count;
}
    public int solve(ArrayList<Integer> A) {
        int i,j,n=A.size();
         int k=0;
         int res = 0, count;
  
    // iterate over total of 32bits
    // from msb to lsb
    for (int bit = 31; bit >= 0; bit--)
    {
        // find the count of element
        // having set msb
        count = checkBit(res | (1 << bit), A, n);
  
        // if count >= 2 set particular
        // bit in result
        if ( count >= 2 )    
            res |= (1 << bit);    
    }
  
    return res;
    }
}


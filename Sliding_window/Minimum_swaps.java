public class Solution {
    public int solve(ArrayList<Integer> A, int k) {
       int count = 0;
       int n=A.size();
    for (int i = 0; i < n; ++i)
    if (A.get(i) <= k)
        ++count;
 
    // Find unwanted elements in current
    // window of size 'count'
    int bad = 0;
    for (int i = 0; i < count; ++i)
    if (A.get(i) > k)
        ++bad;
 
    // Initialize answer with 'bad' value of
    // current window
    int ans = bad;
    for (int i = 0, j = count; j < n; ++i, ++j) {
 
    // Decrement count of previous window
    if (A.get(i) > k)
        --bad;
 
    // Increment count of current window
    if (A.get(j) > k)
        ++bad;
 
    // Update ans if count of 'bad'
    // is less in current window
    ans = Math.min(ans, bad);
    }
    return ans;
        

    }
}


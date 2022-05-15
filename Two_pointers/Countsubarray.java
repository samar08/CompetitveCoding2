public class Solution {
    public int solve(ArrayList < Integer > A) {
      HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
      int l = 0, r = 0, mod = 1000 * 1000 * 1000 + 7;
      long ans = 0;
      // l and r represent the window which we are checking
      for (Integer x: A) {
        if (mp.get(x) != null) {
          // if we already have x in window, start removing elements from the left
          while (mp.get(x) != 0) {
            mp.put(A.get(l), 0);
            l++;
          }
        }
        mp.put(x, 1);
        // number of subarrays ending at index r
        ans += r - l + 1;
        ans %= mod;
        r++;
      }
      return (int) ans;
    }
  }
  
import java.util.*;
import java.lang.*;
public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        HashMap<Integer, HashSet<Integer>> mpx = new HashMap<>();
        HashSet<Integer> h;
        for (int i = 0; i < n; i++) {
            if (mpx.containsKey(A.get(i)))
                h = mpx.get(A.get(i));
            else
                h = new HashSet<>();
            h.add(B.get(i));
            mpx.put(A.get(i), h);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A.get(i) == A.get(j) || B.get(i) == B.get(j))
                    continue;
                if(A.get(i)<A.get(j) && B.get(i)>B.get(j)){
                if (mpx.get(A.get(i)).contains(B.get(j)) && mpx.get(A.get(j)).contains(B.get(i)))
                    ans++;
                }
            }
        }
        return ans;
      

    }
}

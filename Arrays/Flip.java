public class Solution {
    public ArrayList<Integer> flip(String str) {
                int max_so_far = Integer.MIN_VALUE, max_ending_here = 0, start = 0,
            end = 0, s = 0;
            int n=str.length();
        boolean allOne = true;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '0') allOne = false;
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (allOne) {
            
            return ans;
        }

        for (int i = 0; i < n; i++) {
            max_ending_here += (str.charAt(i) == '1' ? -1 : 1);

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        ans.add(start + 1);
        ans.add(end + 1);
        return ans;
    }
}


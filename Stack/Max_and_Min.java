public class Solution {
    public int solve(int[] A) {
        int n = A.length, mod = 1000 * 1000 * 1000 + 7;
        int a[] = new int[n + 1];
        int Next_greater_element[] = new int[n + 1];
        int Previous_greater_element[] = new int[n + 1];
        int Previous_smaller_element[] = new int[n + 1];
        int Next_smaller_element[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            Next_greater_element[i + 1] = n + 1;
            Next_smaller_element[i + 1] = n + 1;
            a[i + 1] = A[i];
        }
        Stack < Integer > s = new Stack < Integer > ();
        for (int i = 1; i <= n; i++) { // this loop calculates next_greater element index
            if (s.empty()) {
                s.push(i);
            } else {
                while (!s.empty() && a[s.peek()] <= a[i]) {
                    Next_greater_element[s.peek()] = i;
                    s.pop();
                }
                s.push(i);
            }
        }
        while (!s.empty()) {
            s.pop();
        }
        for (int i = n; i > 0; i--) { // this loop calculates Previous_greater element index
            if (s.empty()) {
                s.push(i);
            } else {
                while (!s.empty() && a[i] > a[s.peek()]) {
                    Previous_greater_element[s.peek()] = i;
                    s.pop();
                }
                s.push(i);
            }
        }
        while (!s.empty()) {
            s.pop();
        }
        for (int i = n; i > 0; i--) { // this loop calculates Previous smaller element index
            if (s.empty()) {
                s.push(i);
            } else {
                while (!s.empty() && a[i] <= a[s.peek()]) {
                    Previous_smaller_element[s.peek()] = i;
                    s.pop();
                }
                s.push(i);
            }
        }
        while (!s.empty()) {
            s.pop();
        }
        for (int i = 1; i <= n; i++) { // this loop calculates Next smaller element index
            if (s.empty()) {
                s.push(i);
            } else {
                while (!s.empty() && a[i] < a[s.peek()]) {
                    Next_smaller_element[s.peek()] = i;
                    s.pop();
                }
                s.push(i);
            }
        }
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            long right = Next_greater_element[i] - i;
            long left = i - Previous_greater_element[i];
            ans += (((left * right) % mod) * a[i]) % mod;
            ans %= mod;
            left = i - Previous_smaller_element[i];
            right = Next_smaller_element[i] - i;
            ans -= (((left * right) % mod) * a[i]) % mod;
            ans += mod;
            ans %= mod;
        }
        return (int) ans;
    }
}
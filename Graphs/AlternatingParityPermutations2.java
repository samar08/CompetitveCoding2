import java.util.*;
import java.io.*;
public class AlternatingParityPermutations2 {

    public static List<List<Integer>> alternatingParityPermutations(int n) {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        
        // Separate odd and even numbers
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evens.add(i);
            } else {
                odds.add(i);
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        // Start backtracking with odd and even numbers
        for (int odd : odds) {
            List<Integer> currentPermutation = new ArrayList<>();
            currentPermutation.add(odd);
            backtrack(currentPermutation, "odd", odds, evens, result, n);
        }
        
        for (int even : evens) {
            List<Integer> currentPermutation = new ArrayList<>();
            currentPermutation.add(even);
            backtrack(currentPermutation, "even", odds, evens, result, n);
        }
        
        // Sort the result lexicographically
        Collections.sort(result, (a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        return result;
    }

    private static void backtrack(List<Integer> currPerm, String lastParity, List<Integer> odds, List<Integer> evens, List<List<Integer>> result, int n) {
        if (currPerm.size() == n) {
            result.add(new ArrayList<>(currPerm));
            return;
        }

        if (lastParity.equals("odd")) {
            // Add even numbers if the last number was odd
            for (int even : evens) {
                if (!currPerm.contains(even)) {
                    currPerm.add(even);
                    backtrack(currPerm, "even", odds, evens, result, n);
                    currPerm.remove(currPerm.size() - 1);  // Backtrack
                }
            }
        } else {
            // Add odd numbers if the last number was even
            for (int odd : odds) {
                if (!currPerm.contains(odd)) {
                    currPerm.add(odd);
                    backtrack(currPerm, "odd", odds, evens, result, n);
                    currPerm.remove(currPerm.size() - 1);  // Backtrack
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        int n = 11;
        PrintStream fileStream = new PrintStream("output2.txt");
System.setOut(fileStream);
        List<List<Integer>> result = alternatingParityPermutations(n);
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
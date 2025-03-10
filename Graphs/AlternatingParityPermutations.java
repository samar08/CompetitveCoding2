import java.util.*;
import java.io.*;
public class AlternatingParityPermutations {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        PrintStream fileStream = new PrintStream("output1.txt");
System.setOut(fileStream);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        List<List<Integer>> res=alternatingParityPermutations(n);
        for(List<Integer> value: res){
            System.out.println(value);
        }
        
    }
        public static List<List<Integer>> alternatingParityPermutations(int n) {
            // Write your code here
                List<List<Integer>> res = new ArrayList<>();
                dfs(res, new ArrayList<Integer>(), n);
                return res;
            }

            private static void dfs(List<List<Integer>> list, List<Integer> tempList, int n) {
                if(tempList.size() == n)
                    list.add(new ArrayList<>(tempList));
                else {
                    for(int i = 1; i <= n; i++) {
                        if(tempList.contains(i))
                            continue;
                        int size = tempList.size();
                        if(size == 0) {
                            tempList.add(i);
                            dfs(list, tempList, n);
                            tempList.remove(tempList.size() - 1);
                        }
                        else if(Math.abs((i - tempList.get(size - 1))) % 2 == 1) {
                            tempList.add(i);
                                dfs(list, tempList, n);
                                tempList.remove(tempList.size() - 1);
                        }

                    }
                }
            }
        }
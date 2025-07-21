import java.util.*;

public class KString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j,n, k;
        k = sc.nextInt();
        String s = sc.next();
        n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        boolean flag = true;
        String sub = "";
        StringBuilder sb = new StringBuilder();
        Set<Character> keys = map.keySet();
        ArrayList<Character> list = new ArrayList<>(keys);
       // System.out.println(list);
        int keysize = keys.size();
        for (i = 0; i < keysize; i++) {
//            if ((map.get(list.get(i))) % k != 0) {
//                // for(Character key:keys){
//                System.out.println("key: " + list.get(i));
//                System.out.println("val: " + (map.get(list.get(i))));
//                System.out.println("res: " + (map.get(list.get(i))) % k);
                if ((map.get(list.get(i))) % k != 0) {
                    // System.out.println(map.get(key))%k));
                    flag = false;
                    break;
                } else {
                    for (j = 0; j < (int)(map.get(list.get(i))) / k; j++) {
                        sub += (list.get(i));
                      //  System.out.println("sub: "+sub);
                    }
                }
            }
           // System.out.println(map);
            if (flag == false) {
                System.out.println(-1);
            } else {
                for (i = 0; i < k; i++) {
                    sb.append(sub);
                }
                System.out.println(sb.toString());
            }


        }
    }



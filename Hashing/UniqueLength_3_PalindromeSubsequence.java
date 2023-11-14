class Solution {
    public int countPalindromicSubsequence(String s) {
        int i,n=s.length(),j,m,q;
        int count=0;
        HashMap<Character,ArrayList<Integer>> map=new HashMap<Character,ArrayList<Integer>>();
        HashSet<String> set=new HashSet<>();
        for(i=0;i<n;i++){
            ArrayList<Integer> list=map.getOrDefault(s.charAt(i),new ArrayList<Integer>());
            list.add(i);
            map.put(s.charAt(i),list);
        }
        ArrayList<Character> keys=new ArrayList<Character>(map.keySet());
        m=keys.size();
        for(i=0;i<m;i++){
            ArrayList<Integer> list=map.get(keys.get(i));
            int ln=list.size();
            if(ln>1){

                    int c=list.get(0);
                    int endi=list.get(ln-1);
                    for(int index=c+1;index<endi;index++ ){
                        String a=""+s.charAt(c);
                        a=a+s.charAt(index);
                        a=a+s.charAt(endi);
                        set.add(a);
                    }
                
            }
        }
        count=set.size();
        return count;

    }
}
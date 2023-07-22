class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,ArrayList<String>> map=new HashMap<>();
        map.put(2,new ArrayList<>(Arrays.asList("a","b","c")));
        map.put(3,new ArrayList<>(Arrays.asList("d","e","f")));
        map.put(4,new ArrayList<>(Arrays.asList("g","h","i")));
        map.put(5,new ArrayList<>(Arrays.asList("j","k","l")));
        map.put(6,new ArrayList<>(Arrays.asList("m","n","o")));
        map.put(7,new ArrayList<>(Arrays.asList("p","q","r","s")));
        map.put(8,new ArrayList<>(Arrays.asList("t","u","v")));
        map.put(9,new ArrayList<>(Arrays.asList("w","x","y","z")));
        List<String> out=new ArrayList<String>();
        int i,n=digits.length(),j=0,k=0;
        if(n==0){
            return out;
        }
        if(n==1){
            ArrayList<String>letters=map.get((digits.charAt(0)-'2')+2);
            for(i=0;i<letters.size();i++){
                out.add(letters.get(i));
            }
        }
        else{
            ArrayList<String> temp=new ArrayList<>();
            for(i=0;i<n;i++){
                if(i==0){
                    temp=map.get((digits.charAt(i)-'2')+2);
                    map.put((digits.charAt(i)-'2')+2,new ArrayList<>(map.get((digits.charAt(i)-'2')+2)));
                }
                else{
                    int newlen=temp.size();
                    ArrayList<String> newletters=map.get((digits.charAt(i)-'2')+2);
                    map.put((digits.charAt(i)-'2')+2,new ArrayList<>(map.get((digits.charAt(i)-'2')+2)));
                    int nk=newletters.size();
                    for(j=0;j<newlen;j++){
                        String ch=temp.remove(0);
                        
                        for(k=0;k<nk;k++){
                            String ch2=ch+newletters.get(k);
                            temp.add(ch2);
                        }
                    }
                }
            }
            out=temp;
        }
        return out;


    }
}
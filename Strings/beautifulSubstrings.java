import java.util.*;
class beautifulSubstrings {
    public static int countbs(String s, int k) {
        int i,n=s.length(),out=0,len=0,j;
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        System.out.println(set);
//         for(i==0;i<n;i++){
//             if(allvowel(s,n)==true){
                
//             }
//         }
        int v=0,c=0;
       
        for(len=2;len<=n;len+=2){
            v=0;
            c=0;
            for(i=0;i<len;i++){
               if(set.contains(s.charAt(i))==true){
                System.out.println("char: "+s.charAt(i)+" i: "+i);
                    v+=1;
                }
                else{
                    c+=1;
                }
            }
            System.out.println("v: "+v+" c: "+c);
            if(v==c){
                if(((v%k)*(c%k))%k==0)
                {
                    System.out.println("len: "+len);
                    System.out.println("i: "+i);
                    System.out.println(v+" "+c);
                    out+=1;
                }
                
            }
            for(i=len;i<n;i++){
                
                if(set.contains(s.charAt(i-len))==true){
                v-=1;
                }
                else{
                    c-=1;
                }
                if(set.contains(s.charAt(i))==true){
                    v+=1;
                }
                else{
                    c+=1;
                }
                 if(v==c){
                if(((v%k)*(c%k))%k==0)
                {
                    System.out.println("len: "+len);
                    System.out.println("i: "+i);
                    System.out.println(v+" "+c);
                    out+=1;
                }
                
            }
                
            }
            
        }
        return out;
    }
    public static void main(String[] args){
      //  Scanner sc=new Scanner(Sys)
      String s="baeyh";
      int k=2;
      System.out.println(countbs(s,k));
    }
}
import java.util.*;

class TrieNode{
    HashMap<Character,TrieNode> map;
    boolean endofword;
    TrieNode(){
        map=new HashMap<Character,TrieNode>();
        endofword=false;
    }
}
public class ImplementTrie {
    public static TrieNode insert(String s,int st,int n,TrieNode root){
        TrieNode next;
        if(st==n-1){
            if(root.map.containsKey(s.charAt(st))==true){
                 next=root.map.get(s.charAt(st));
                next.endofword=true;
            }
            else{
                next=new TrieNode();
                next.endofword=true;
                root.map.put(s.charAt(st),next);
            }
        }
        else{
            if(root.map.containsKey(s.charAt(st))==false){
                next=new TrieNode();
                root.map.put(s.charAt(st),next);
            }
            root.map.put(s.charAt(st),insert(s,st+1,n,root.map.get(s.charAt(st))));
        }
        return root;
    }
    public static boolean search(TrieNode root,String s){
        int n=s.length(),i;
        for(i=0;i<n;i++){
            if(i==n-1){
                if(root.map.containsKey(s.charAt(i))==true){
                    TrieNode next=root.map.get(s.charAt(i));
                    if(next.endofword==true){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else{
                if(root.map.containsKey(s.charAt(i))==true){
                    root=root.map.get(s.charAt(i));
                }
                else{
                    return false;
                }
            }
          
        }
        return false;
    }
  
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of strings you want to enter: ");
        int n=sc.nextInt();
        int i=0;
        TrieNode root=new TrieNode();
        for(i=0;i<n;i++){
            System.out.println("Enter the string"+(i+1)+": ");
            String s=sc.next();
            int ln=s.length();
            root=insert(s,0,ln,root);
        }
        System.out.println("Enter number of strings you want to search: ");
        int m=sc.nextInt();
        for(i=0;i<m;i++){
            System.out.println("Enter the string you want to search: ");
            String w=sc.next();
            if(search(root,w)==true){
                System.out.println("String is present in Trie");
            }
            else{
                System.out.println("String is not present in Trie");
            }
        }
    }
    
}

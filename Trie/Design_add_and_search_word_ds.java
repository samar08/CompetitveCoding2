class TrieNode{
    HashMap<Character,TrieNode> map;
    boolean endofword;
    TrieNode(){
        map=new HashMap<Character,TrieNode>();
        endofword=false;
    }
}
class WordDictionary {
    TrieNode root;
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
    public static boolean triesearch(TrieNode root,String s,int i,int n){
           
        
            if(i==n-1){
                if(s.charAt(i)=='.' || root.map.containsKey(s.charAt(i))==true){
                    if(s.charAt(i)=='.'){
                        for(Character key: root.map.keySet()){
                        TrieNode next=root.map.get(key);
                        if(next.endofword==true){
                            return true;
                        }
                    }
                    return false;
                    }
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
                if( root.map.containsKey(s.charAt(i))==true){
                    return triesearch(root.map.get(s.charAt(i)),s,i+1,n);
                }
                else if(s.charAt(i)=='.'){
                    for(Character key: root.map.keySet()){
                        TrieNode next=root.map.get(key);
                        if(triesearch(next,s,i+1,n)==true){
                            return true;
                        }
                    }
                }
                else{
                    return false;
                }
            }
          
        
        return false;
    }
    public WordDictionary() {
      root=new TrieNode();
    }
    
    public void addWord(String word) {
        int n=word.length();
        root=insert(word,0,n,root);
    }
    
    public boolean search(String s) {
        int n=s.length();
     return triesearch(root,s,0,n);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
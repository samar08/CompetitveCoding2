class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int i=0,j=0;
        StringBuilder sb=new StringBuilder();
        while(i<n1 && j<n2){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i+=1;
            j+=1;
        }
        while(i<n1){
             sb.append(word1.charAt(i));
             i+=1;
        }
        while(j<n2){
             sb.append(word2.charAt(j));
             j+=1;
        }
        return sb.toString();
    }
}
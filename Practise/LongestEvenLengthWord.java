public class LongestEvenLengthWord {
    
    public static void main(String[] args) {
        String s= "random string hello .mohanasamarasimha";
        int maxi=0;
        String[] words=s.split(" ");
        for(String word: words){
            System.out.println(word);
            int len=word.length();
            if(len%2==0){
                maxi=Math.max(maxi,len);
            }
        }
        System.out.println(maxi);    
    }
}

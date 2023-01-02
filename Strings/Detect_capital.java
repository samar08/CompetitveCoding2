class Solution {
    public boolean detectCapitalUse(String word) {
        int i=0,n=word.length();
        int upper_count=0,lower_count=0;
        boolean first_cap=false;
        for(i=0;i<n;i++){
            if(Character.isUpperCase(word.charAt(i))){
                upper_count++;
                if(i==0){
                    first_cap=true;
                }
            }
            else{
                lower_count++;
            }
        }
        if(upper_count==n || lower_count==n){
            return true;
        }
        else if(upper_count==1 && first_cap==true){
            return true;
        }
        return false;
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i,j,n=9,k1=0,k2=0;
        for(i=0;i<n;i++){
            HashSet<Character> s=new HashSet<Character>();
            for(j=0;j<n;j++){
                if(board[i][j]!='.'){
                    if(s.contains(board[i][j])){
                        return false;
                    }
                    else{
                        s.add(board[i][j]);
                    }
                }
                
            }
        }
        for(j=0;j<n;j++){
             HashSet<Character> s=new HashSet<Character>();
            for(i=0;i<n;i++){
                 if(board[i][j]!='.'){
                    if(s.contains(board[i][j])){
                        return false;
                    }
                    else{
                        s.add(board[i][j]);
                    }
                }
            }
        }
        i=0;
        while(i<n){
            j=0;
            while(j<n){
                HashSet<Character> s=new HashSet<Character>();
                for(k1=i;k1<i+3;k1++){
                    for(k2=j;k2<j+3;k2++){
                        if(board[k1][k2]!='.'){
                            if(s.contains(board[k1][k2])){
                        return false;
                    }
                    else{
                        s.add(board[k1][k2]);
                    }
                        }
                    }
                }
                j+=3;
            }
            i+=3;
        }
        return true;
    }
}
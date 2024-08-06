class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i,j,m=board.length,n=board[0].length;
        for(i=0;i<m;i++){
            HashSet<Integer> set=new HashSet<>();
            for(j=0;j<n;j++){
                if(board[i][j]!='.'){
                    if(set.contains(board[i][j]-'0')){
                      return false;
                    }
                    else{
                        set.add(board[i][j]-'0');
                    }
                }
            }
        }
         for(j=0;j<n;j++){
            HashSet<Integer> set=new HashSet<>();
            for(i=0;i<m;i++){
                if(board[i][j]!='.'){
                    if(set.contains(board[i][j]-'0')){
                      return false;
                    }
                    else{
                        set.add(board[i][j]-'0');
                    }
                }
            }
        }
        for(i=0;i<3;i++){
            
            for(j=0;j<3;j++){
                int rowstart=(i*3);
                int colstart=(j*3);
                HashSet<Integer> set=new HashSet<>();
                for(int row=rowstart;row<rowstart+3;row++){
                    for(int col=colstart;col<colstart+3;col++){
                        if(board[row][col]!='.'){
                            if(set.contains(board[row][col]-'0')){
                                return false;
                            }
                            else{
                                set.add(board[row][col]-'0');
                            }
                        }
                       
                    }
                }
            }
        }
        return true;
        
    }
}
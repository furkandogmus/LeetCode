class Solution {
    public boolean isValidSudoku(char[][] board) {
        System.out.println(this.checkRows(board));
        System.out.println(this.checkCols(board));
        System.out.println(this.check3x3Squares(board));
        return (this.checkRows(board) && this.checkCols(board) && this.check3x3Squares(board));
    }
    
    public boolean checkRows(char[][] board) {
        int rows = 9;
        int cols = 9;
        for(int i=0;i<rows;i++){
            HashSet<Character> hs = new HashSet<>();
            for(int j=0;j<cols;j++){
                if(!hs.contains(board[i][j]) || board[i][j]=='.'){
                    hs.add(board[i][j]);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public boolean checkCols(char[][] board) {
        int rows = 9;
        int cols = 9;
        for(int i=0;i<rows;i++){
            HashSet<Character> hs = new HashSet<>();
            for(int j=0;j<cols;j++){
                if(!hs.contains(board[j][i]) || board[j][i]=='.'){
                    hs.add(board[j][i]);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean check3x3Squares(char[][] board) {
        int rows = 9;
        int cols = 9;
        for(int i=0;i<rows;i+=3){
           for(int j=0;j<cols;j+=3){
               HashSet<Character> hs = new HashSet<>(); 
               for(int k=i;k<i+3;k++){
                    for(int p=j;p<j+3;p++){

                        if(!hs.contains(board[k][p]) || board[k][p]=='.'){
                            hs.add(board[k][p]);
                        }
                        else{
                            return false;
                        }
                        
                    }
                }
                
                
          
            }
        }
        return true;
    }
}
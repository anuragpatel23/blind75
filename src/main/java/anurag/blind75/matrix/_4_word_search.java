package anurag.blind75.matrix;

public class _4_word_search {

    public static void main(String... args){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        Solution s= new Solution();
        boolean result = s.exist(board, word);

        System.out.println("result : "+result );
    }


}

class Solution{
    public char[][] board;
    public int cols;
    public int rows;
    public boolean exist(char[][] board, String word) {
        this.board=board;
        this.cols=board[0].length;
        this.rows=board.length;

        for (int r=0; r<rows; r++){
            for (int c=0; c<cols; c++){
                if (backtrack(r,c,word,0)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean backtrack(int row, int col, String word, int index){

        if(index>= word.length()){
            return true;
        }

        if(row<0 || row>=rows || col<0 || col>=cols || this.board[row][col] != word.charAt(index)){
            return false;
        }
        this.board[row][col] = '@';
        int[] coldirection = {1,0,-1,0};
        int[] rowdirection = {0,1,0,-1};

        boolean result = false;
        for(int d=0; d<4;d++){
            result = backtrack(row + rowdirection[d], col + coldirection[d], word, index+1);
            if(result)
                break;
        }

        board[row][col] = word.charAt(index);
        return result;
    }


}
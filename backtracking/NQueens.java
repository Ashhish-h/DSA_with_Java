package backtracking;

// In nQueens problem we place n number of queens in n rows
// in such a way that no queen attact each other

public class NQueens {
    // for simpling placing queens in rows
    public static void nQueens(char[][] board, int row){
        if(row == board.length){
            print(board);
            return;
        }

        // initilizing board with queens
        for(int index = 0; index < board.length; index++){
            board[row][index] = 'Q';
            nQueens(board, row + 1);
            board[row][index] = 'x';
        }
    }

    public static void print(char[][] arr){
        for(int rowIndex = 0; rowIndex < arr.length; rowIndex++){
            for(int colIndex = 0; colIndex < arr.length; colIndex++){
                System.out.print(arr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] arhs){
        char[][] board = new char[3][3];
        for(int rowIndex = 0; rowIndex < board.length; rowIndex++){
            for(int colIndex = 0; colIndex < board.length; colIndex++){
                board[rowIndex][colIndex] = 'x';
            }
        }

        nQueens(board, 0);
    }
}

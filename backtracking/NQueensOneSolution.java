package backtracking;

public class NQueensOneSolution {
    public static boolean isSafe(char[][] board, int row, int col){
        //checking vertically
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // checking left diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // checking right diagonal
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;

    }

    // we will just change the return type of this function so that if it get a single soultion it will return true
    public static boolean nQueens(char[][] board, int row){
        if(row == board.length){
            return true;
        }

        // initilizing board with queens
        for(int index = 0; index < board.length; index++){
            if(isSafe(board, row, index)){
                board[row][index] = 'Q';
                if(nQueens(board, row + 1)){
                    return true;
                }
                board[row][index] = 'x';
            }
            
        }
        return false;
    }

    public static void print(char[][] arr){
        System.out.println("----------Chess Board-----------");
        for(int rowIndex = 0; rowIndex < arr.length; rowIndex++){
            for(int colIndex = 0; colIndex < arr.length; colIndex++){
                System.out.print(arr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] arhs){
        char[][] board = new char[4][4];
        for(int rowIndex = 0; rowIndex < board.length; rowIndex++){
            for(int colIndex = 0; colIndex < board.length; colIndex++){
                board[rowIndex][colIndex] = 'x';
            }
        }

        if(nQueens(board, 0)){
            System.out.println("Solution: ");
            print(board);
        } else {
            System.out.println("Solution is not possbile: ");
        }
    }
}

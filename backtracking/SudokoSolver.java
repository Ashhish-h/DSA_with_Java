package backtracking;

class SudokuSolver {

    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {

        // condition for column
        for (int j = 0; j < 9; j++) {
            if (sudoku[j][col] == digit) return false;
        }

        // condition for row
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit) return false;
        }

        // for checking particular grids inside the main sudoko grid
        int gridStartRow = (row / 3) * 3;
        int gridStartCol = (col / 3) * 3;

        // for checking in 3x3 matrix
        for (int i = gridStartRow; i < gridStartRow + 3; i++) {
            for (int j = gridStartCol; j < gridStartCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {

        // base case
        if (row == 9) {
            return true;
        }

        // this is to change the row and col
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // this is to check for the non-zero numbers in sudoku
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) { // check if solution exists
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void print(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {0, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists for the sudoku");
            print(sudoku);
        } else {
            System.out.println("Solution doesn't exist");
        }
    }
}

package backtracking;

// find number of ways to travel from (0,0) to (n - 1, m - 1) on a n * m grid.
public class GridWays {
    public static int gridWays(int i, int j, int n, int m){
        // base case
        if(i == n - 1 && j == m - 1){ // when you are on (n - 1, m - 1) 
            return 1;
        } else if(i == n || j == m){ // booundary cross condition
            return 0;
        }

        //     path on right side         path on down side   
        return gridWays(i + 1, j, n, m) + gridWays(i, j + 1, n, m);
    }

    public static void main(String[] args){
        int n = 3, m = 3;
        int noOfWays = gridWays(0, 0, n, m);
        System.out.println(noOfWays);        
    }
}

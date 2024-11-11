public class GridPath {
    /** Initialized in the constructor with distinct values that never change */
    private int[][] grid;

    public GridPath(int [][] values){
        grid = values;
    }
    /**
     * Returns the Location representing a neighbor of the grid element at row and
     * col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public Location getNextLoc(int row, int col) {
        if (row + 1 >= grid.length){
            return new Location (row, col+1);
        }
        if (col + 1 >= grid[0].length){
            return new Location (row+1, col);
        }
        int value1 = grid[row+1][col];
        int value2 = grid[row][col+1];
        if (value1 < value2) return new Location(row+1, col);
        else return new Location (row, col+1);
    }

    public String toString(){
        String s = "";
        for(int row = 0; row < grid.length; row ++){
            for (int col = 0; col < grid.length; col ++){
                s += grid[row][col]+ " ";
            }
            s += "\n";
        }
        return s;}

    public int sumPath(int row, int col){
        int r = row;
        int c = col;
        int sum = 0;
        while (r < grid.length-1 || c < grid[0].length-1){
            sum += grid[r][c];
            Location value = getNextLoc(r, c);
            r = value.getRow();
            c = value.getCol();
        }
        return sum;
    }
}

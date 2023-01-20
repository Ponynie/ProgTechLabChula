public class Mtx {
    //Field-----------------------------------------------------------------------
    private int row , column;
    private int[][] matrix;
    //Contructor------------------------------------------------------------------
    public Mtx(int[][] matrix) {
        this.matrix = matrix;
        this.row = matrix.length;
        this.column = matrix[0].length;
    }
    //Method----------------------------------------------------------------------
    public boolean equalSize(Mtx other) {
        boolean sameSize = this.row == other.row && this.column == other.column;
        return sameSize;
    }
    public boolean compatible(Mtx other) {
        boolean compatible = this.column == other.row;
        return compatible;
    }
    public Mtx add(Mtx other) {
        int[][] result = new int[row][column];
        for (int i = 0 ; i < row ; i++) {
            for (int j = 0 ; j < column ; j++) {
                result[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
        return new Mtx(result);
    }
    public Mtx mul(Mtx other) {
        int[][] result = new int[this.row][other.column];
        for (int i = 0 ; i < this.row ; i++) {
            for (int j = 0 ; j < other.column ; j++) {
                for (int k = 0 ; k < this.column ; k++) {
                    result[i][j] += (this.matrix[i][k] * other.matrix[k][j]);
                }
            }
        }
        return new Mtx(result);
    }
    public Mtx mul(int n) {
        int[][] result = this.matrix;
        for (int i = 0 ; i < row ; i++) {
            for (int j = 0 ; j < column ; j++) {
                result[i][j] = this.matrix[i][j] * n;
            }
        }
        return new Mtx(result);
    }
    public void display() {
        for (int i = 0 ; i < row ; i++) {
            for (int j = 0 ; j < column ; j++) {
                if (j == column - 1) {
                    System.out.println(String.valueOf(this.matrix[i][j]));
                }
                else {
                    System.out.print(String.valueOf(this.matrix[i][j]) + " ");
                }
            }
        }
    }
}

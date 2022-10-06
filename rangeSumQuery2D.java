class NumMatrix {

   int[][] sumMatrix;
    
    public NumMatrix(int[][] matrix) {
        sumMatrix = new int[matrix.length + 1][matrix[0].length + 1];
        for(int i=0; i<matrix[0].length + 1; i++){
            sumMatrix[0][i] = 0;
        }
        for(int i=0; i<matrix.length + 1; i++){
            sumMatrix[i][0] = 0;
        }
        for(int i=0; i<matrix.length; i++){
            int prefix = 0;
            
            for(int j=0; j<matrix[i].length; j++){
                    prefix += matrix[i][j];
                    int above = sumMatrix[i][j+1];
                    sumMatrix[i+1][j+1] = prefix + above;
            }
        }
        System.out.println(Arrays.deepToString(sumMatrix));
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; row2++; col1++; col2++;
        
        int bottomRight = sumMatrix[row2][col2];
        int above = sumMatrix[row1-1][col2];
        int left = sumMatrix[row2][col1-1];
        int topLeft = sumMatrix[row1-1][col1-1];
                
        return (bottomRight - above - left) + topLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

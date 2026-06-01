class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;


        //Better Sol
        //Making two arrays of boolean value to track in which row or colum the value is 0
        boolean [] rowArr = new boolean[row];
        boolean [] colArr = new boolean[col];

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(matrix[i][j] == 0){
                    rowArr[i] = true;
                    colArr[j] = true;
                }
            }
        }

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(rowArr[i] || colArr[j]){
                    matrix[i][j] = 0;
                }
            }
        }

        //BRUTE FORCE Sol
    //   for(int i = 0; i<row; i++){
    //     for(int j = 0; j<col; j++){
    //         if(matrix[i][j] == 0){
    //             markRow(matrix, i);
    //             markCol(matrix, j);
    //         }
    //     }
    //   }
    //   for(int i = 0; i<row; i++){
    //     for(int j = 0; j<col; j++){
    //         if(matrix[i][j] == -1){
    //             matrix[i][j] = 0;
    //         }
    //     }
    //   }  
    // }
    // static void markRow(int [][] matrix, int row){
    //     for(int j = 0; j<matrix[0].length; j++){
    //         if(matrix[row][j] != 0){
    //             matrix[row][j] = -1;
    //         }
    //     }
    // }
    // static void markCol(int [][] matrix, int col){
    //     for(int i = 0; i<matrix.length; i++){
    //         if(matrix[i][col] != 0){
    //             matrix[i][col] = -1;
    //         }
    //     }
    }
}
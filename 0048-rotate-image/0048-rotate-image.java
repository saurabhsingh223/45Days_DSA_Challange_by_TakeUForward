class Solution {
    public void rotate(int[][] matrix) {
        //Optimal Solution
        int n = matrix.length;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i<n; i++){
            int left = 0, right = n-1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
         //Brute Force Solution
        // int [][] ans = new int [matrix.length][matrix[0].length];
        // int n = matrix.length;
        // for(int i = 0; i<matrix.length; i++){
        //     for(int j = 0; j<matrix[0].length; j++){
        //         ans[j][n-1-i] = matrix[i][j];
        //     }
        // }
        // for(int i = 0; i<matrix.length; i++){
        //     for(int j = 0; j<matrix[0].length; j++){
        //         matrix[i][j] = ans[i][j];
        //     }
        // }
    // }
}
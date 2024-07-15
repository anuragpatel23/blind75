package anurag.blind75.matrix;

import java.util.Arrays;

public class _1_set_matrix_zero {
    public static void main(String... args){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeros(matrix);
        System.out.println("result : "+ Arrays.toString(matrix));
    }

    private static void setZeros(int[][] matrix){
        Boolean firstColumn= false;
        int row=matrix.length;
        int col=matrix[0].length;

        for (int i=0;i<row; i++){
            if(matrix[i][0] == 0){
                firstColumn= true;
            }
            for (int j=1; j<col; j++){
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;

                }
            }
        }

        for (int i=1; i<row; i++){
            for (int j=1; j<col; j++){
                if (matrix[i][0] ==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for (int i=0; i<col; i++){
                matrix[0][i] = 0;
            }
        }
        if (firstColumn){
            for (int j=0; j<row; j++){
                matrix[j][0] = 0;
            }
        }
    }
}

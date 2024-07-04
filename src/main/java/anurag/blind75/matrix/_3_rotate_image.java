package anurag.blind75.matrix;

import java.util.Arrays;

public class _3_rotate_image {
    public static void main(String... args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] result=rotate(matrix);

        for(int[] a: result){
            for(int b: a){
            System.out.println(b);
            }
        }

    }

    private static int[][] rotate(int[][] matrix) {

        //Transpose
        for (int i=0; i<matrix.length;i++){
            for (int j=i+1; j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse rows
        for(int i=0; i<matrix.length; i++){
            int left=0;
            int right=matrix.length-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }

        return matrix;
    }
}

package anurag.blind75.matrix;

import java.util.*;

public class _2_spiral_matrix {

    public static void main(String... args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        List<Integer> result1 = spiralOrderShrinkingSolution(matrix);
        List<Integer> result2 = spiralOrderVisitedHashSetSolution(matrix);
        List<Integer> result3 = spiralOrderVisitedSolution(matrix);

//        System.out.println("Spiral matrix - "+ result1.toString());
        System.out.println("Spiral matrix - "+ result2.toString());
        System.out.println("Spiral matrix - "+ result3.toString());
    }

    private static List<Integer> spiralOrderVisitedHashSetSolution(int[][] matrix){

        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int totalElements = rows * cols;

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int r = 0, c = 0, dir = 0;
        Set<String> visited = new HashSet<>();

        for (int i = 0; i < totalElements; i++) {
            result.add(matrix[r][c]);
            visited.add(r + "" + c);

            int newR = r + dr[dir];
            int newC = c + dc[dir];

            if (newR >= 0 && newR < rows && newC >= 0 && newC < cols && !visited.contains(newR + "" + newC)) {
                r = newR;
                c = newC;
            } else {
                dir = (dir + 1) % 4;
                r += dr[dir];
                c += dc[dir];
            }
        }

        return result;
    }

    private static List<Integer> spiralOrderVisitedSolution(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;

        int row = 0, col = 0;
        int[][] directions = {{0,1}, {1,0}, {0,-1},{-1,0}};

        int currentdirection = 0, changedirection = 0;
        List<Integer> ans = new ArrayList<>();
        ans.add(matrix[0][0]);
        int visited = 101;
        matrix[0][0] = visited;
        while(changedirection<2){
            while(row + directions[currentdirection][0] >= 0 &&
                    row + directions[currentdirection][0] < rows &&
                    col + directions[currentdirection][1] >= 0 &&
                    col + directions[currentdirection][1] < columns &&
                    matrix[row+directions[currentdirection][0]][col + directions[currentdirection][1]] != visited){

                changedirection = 0;
                row = row + directions[currentdirection][0];
                col = col + directions[currentdirection][1];

                ans.add(matrix[row][col]);
                matrix[row][col] = visited;
            }
            currentdirection = (currentdirection + 1) % 4;
            changedirection++;
        }
        return ans;
    }
}

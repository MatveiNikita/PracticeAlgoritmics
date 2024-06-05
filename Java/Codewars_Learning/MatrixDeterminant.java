package Codewars_Learning;

import java.util.Arrays;

public class MatrixDeterminant {
    public static void main(String[] args) {
        System.out.println(determinant(new int[][]{{2,5,3}, {1,-2,-1}, {1, 3, 4}}));
    }

    public static int determinant(int[][] matrix) {
        if (matrix.length < 2)
            return matrix[0][0];
        else if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            int result = 0;
            for (int j = 0; j < matrix.length; j++) {
                int[][] submatrix = new int[matrix.length - 1][matrix.length - 1];
                for (int i = 1; i < matrix.length; i++) {
                    for (int k = 0, l = 0; k < matrix.length; k++) {
                        if (k == j) continue;
                        submatrix[i - 1][l++] = matrix[i][k];
                    }
                }
                int sign = (j % 2 == 0) ? 1 : -1;
                result += sign * matrix[0][j] * determinant(submatrix);
            }
            return result;
        }
    }
}

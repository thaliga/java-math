
package net.projecteuler;


public class Problem015 {

    public static long calculateNxM(int height, int width) {
        int matrix[][] = new int[height][width];
        for (int i = 0; i < height; ++i) {
            matrix[i][0] = 1;
        }
        for (int j = 0; j < width; ++j) {
            matrix[0][j] = 1;
        }
        for (int i = 1; i < height; ++i) {
            for (int j = 1; j < width; ++j) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            }
        }
        return matrix[height - 1][width - 1];
    }

    public static long calculateNxN(int size) {
        long matrix[][] = new long[size][size];
        for (int j = 0; j < size; ++j) {
            matrix[0][j] = 1;
        }
        for (int j = 1; j < size; ++j) {
            for (int i = 1; i < j; ++i) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            }
            matrix[j][j] = 2 * matrix[j - 1][j];
        }
        return matrix[size - 1][size - 1];
    }

    public static long calculatePascalTriangleElement(int row, int column) {
        int r = row + 1;
        long v = 1;
        for (int c = 1; c <= column; ++c) {
            v = v * (r - c) / c;
        }
        return v;
    }

    public static long solution(int n) {
        int column = n - 1;
        return calculatePascalTriangleElement(2 * column, column);
    }

    public static long solutionBruteforce(int n) {
        return calculateNxN(n);
    }
}

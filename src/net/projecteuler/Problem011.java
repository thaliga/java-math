
package net.projecteuler;

public class Problem011 {

    static class Calculator {
        static final int LENGTH = 4;
        int[][] matrix;

        Calculator(int[][] matrix) {
            this.matrix = matrix;
        }

        boolean check(int line, int column, int lineSpace, int columnSpace) {
            return 0 <= line + lineSpace && line + lineSpace < matrix.length && column + columnSpace < matrix[line].length;
        }

        int productSouth(int line, int column) {
            int result = 0;
            if (check(line, column, LENGTH, 0)) {
                result = multiply(line, column, 1, 0);
            }
            return result;
        }

        int productEast(int line, int column) {
            int result = 0;
            if (check(line, column, 0, LENGTH)) {
                result = multiply(line, column, 0, 1);
            }
            return result;
        }

        int productSouthEast(int line, int column) {
            int result = 0;
            if (check(line, column, LENGTH, LENGTH)) {
                result = multiply(line, column, 1, 1);
            }
            return result;
        }

        int productNorthEast(int line, int column) {
            int result = 0;
            if (check(line, column, -LENGTH, LENGTH)) {
                result = multiply(line, column, -1, 1);
            }
            return result;
        }

        private int multiply(int line, int column, int lineIncrement, int columnIncrement) {
            int result = matrix[line][column];
            for (int i = 1; i < 4; ++i) {
                result *= matrix[line + i * lineIncrement][column + i * columnIncrement];
            }
            return result;
        }

        int calculate() {
            int result = 0;
            for (int i = 0; i < matrix.length; ++i) {
                int length = matrix[i].length;
                for (int j = 0; j < length; ++j) {
                    int p = productSouth(i, j);
                    if (p > result) {
                        result = p;
                    }
                    p = productSouthEast(i, j);
                    if (p > result) {
                        result = p;
                    }
                    p = productEast(i, j);
                    if (p > result) {
                        result = p;
                    }
                    p = productNorthEast(i, j);
                    if (p > result) {
                        result = p;
                    }
                }
            }
            return result;
        }
    }

    public static long solutionBruteforce(int[][] matrix) {
        return new Calculator(matrix).calculate();
    }
}

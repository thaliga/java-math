
package net.projecteuler;


public class Problem009 {

    public static long solutionBruteforce(int sum) {
        long result = 0;
        for (int a = 1; a < sum - 2; ++a) {
            for (int b = a + 1; b < sum - 1; ++b) {
                int c = sum - a - b;
                if (c < b) {
                    break;
                }
                if (a * a + b * b == c * c) {
                    result = a * b * c;
                    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                    break;
                }
            }
        }
        return result;
    }
}

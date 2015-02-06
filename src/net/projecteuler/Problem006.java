
package net.projecteuler;


public class Problem006 {

    public static long solution(long n) {
        long sum = n * (n + 1) * 1 / 2;
        long sumOfSquare = n * (n + 1) * (2 * n + 1) * 1 / 6;
        return sum * sum - sumOfSquare;
    }

    public static long solutionBruteforce(long limit) {
        long sum = 0;
        long sumOfSquare = 0;
        for (int i = 0; i <= limit; ++i) {
            sum += i;
            sumOfSquare += i * i;
        }
        return sum * sum - sumOfSquare;
    }
}

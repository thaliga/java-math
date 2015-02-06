
package net.projecteuler;

public class Problem028 {

    public static long solution(int size) {
        int n = size / 2;
        int n2 = n * n;
        return 2 * n * (8 * n2 + 13) / 3 + 10 * n2 + 1;
    }
}


package net.projecteuler;

public class Problem014 {

    public static long solutionBruteforce(int number) {
        long result = 0L;
        int max = number - 1;
        int maxSteps = 0;
        if (max % 2 == 0) {
            max = max - 1;
        }
        int limit = 1;
        for (int i = max; i > limit; i -= 2) {
            int steps = getSteps(i);
            if (steps > maxSteps) {
                maxSteps = steps;
                result = i;
            }
        }
        System.out.println(maxSteps + " steps for result: " + result);
        return result;
    }

    private static int getSteps(int n) {
        int steps = 0;
        long l = n;
        while (l > 1) {
            ++steps;
            if (l % 2 == 0) {
                l = l / 2;
            } else {
                l = 3 * l + 1;
            }
        }
        // System.out.println(" steps for n=" + n + ": " + steps);
        // if (l != 1) {
        // System.out.println(" end value is not 1 for n=" + n + ": " + l);
        // }
        return steps;
    }
}


package net.projecteuler;

import static common.Util.isPentagonal;
import static common.Util.pentagonalNumber;

public class Problem044 {

    public static long solution() {
        return 0L;
    }

    public static long solutionBruteforce() {
        long min = Long.MAX_VALUE;
        for (int j = 1; j < 2000; ++j) {
            long pj = pentagonalNumber(j);
            for (int k = 1; k < 2000; ++k) {
                long pk = pentagonalNumber(j + k);
                long diff = pk - pj;
                if (diff >= min) {
                    continue;
                }
                if (!isPentagonal(diff)) {
                    continue;
                }
                System.out.println("Found pentagonal diff = " + diff + " for j = " + j + " and k = " + k);

                if (!isPentagonal(pk + pj)) {
                    continue;
                }
                System.out.println("Found pentagonal sum = " + (pk + pj) + " for j = " + j + " and k = " + k);

                min = diff;
                System.out.println("Found min = " + min + " for j = " + j + " and k = " + k);
            }
        }
        return min == Long.MAX_VALUE ? 0 : min;
    }
}

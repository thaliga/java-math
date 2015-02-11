
package net.projecteuler;

import static java.lang.Math.floor;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import common.Util;

public class Problem005 {

    public static long solution(int n) {
        long result = 1;
        int i = 0;
        boolean check = true;
        int limit = (int) sqrt(n);
        int[] p = Util.Prime.primesUnder(n);
        int[] a = new int[p.length];
        while (i < p.length) {
            a[i] = 1;
            if (check) {
                if (p[i] <= limit) {
                    a[i] = (int) floor(log(n) / log(p[i]));
                }
                else {
                    check = false;
                }
            }
            result = result * (long) pow(p[i], a[i]);
            i = i + 1;
        }
        return result;
    }

    public static long solutionBruteforce(int n) {
        long result = 1;
        for (int i = 2; i <= n; ++i) {
            result = Util.lkkt(i, result);
            // System.out.println("processing " + i + ": new result is " + result);
        }
        return result;
    }
}

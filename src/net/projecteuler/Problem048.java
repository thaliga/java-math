
package net.projecteuler;

import java.math.BigDecimal;

public class Problem048 {

    public static long solution() {
        return 0L;
    }

    public static long solutionBruteforce(int n) {
        BigDecimal sum = new BigDecimal(0);
        for (int i = 1; i <= n; ++i) {
            BigDecimal bd = new BigDecimal(i);
            bd = bd.pow(i);
            sum = sum.add(bd);
        }
        String digits = sum.toPlainString();
        String last10digits = digits.substring(digits.length() - 10);
        return Long.valueOf(last10digits);
    }
}

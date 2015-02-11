
package net.projecteuler;

import common.Util;

public class Problem045 {

    public static long solution(int t, int p, int h) {
        // http://mathworld.wolfram.com/HexagonalPentagonalNumber.html
        for (;;) {
            h = h + 1;
            long hexagonal = Util.hexagonalNumber(h);
            double k = (1 + Math.sqrt(1 + 24 * hexagonal)) / 6;
            if (k == Math.ceil(k)) {
                return hexagonal;
            }
        }
    }

    public static long solutionBruteforce(int t, int p, int h) {
        for (int i = h + 1;; ++i) {
            long hexagonal = Util.hexagonalNumber(i);
            System.out.println(i + " -> " + hexagonal);
            for (int j = p + 1;; ++j) {
                long pentagonal = Util.pentagonalNumber(j);
                if (pentagonal > hexagonal) {
                    break;
                } else if (pentagonal < hexagonal) {
                    continue;
                }
                System.out.println(hexagonal + " -- " + pentagonal);
                for (int k = t + 1;; ++k) {
                    long triangle = Util.triangleNumber(k);
                    System.out.println(hexagonal + " -- " + pentagonal + " -- " + triangle);
                    if (triangle > pentagonal) {
                        break;
                    } else if (triangle < pentagonal) {
                        continue;
                    }
                    return hexagonal;
                }
            }
        }
    }
}

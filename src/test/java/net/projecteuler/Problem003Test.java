
package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem003.solutionBruteforce;

import org.junit.Test;

public class Problem003Test {
    @Test
    public void testSolutionBruteforce() throws Exception {
        long value = 600851475143L;
        double time = nanoTime();
        long result = solutionBruteforce(value);
        checkResult("003", "brute force ", 6857L, result, time);
    }
}

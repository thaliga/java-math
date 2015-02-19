package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem014.solutionBruteforce;

import org.junit.Test;

public class Problem014Test {

	@Test
	public void testSolutionBruteforce() throws Exception {
		// given
		double time = nanoTime();

		// when
		long result = solutionBruteforce(1000000);

		// then
		checkResult("014", "brute force ", 837799L, result, time);
	}
}

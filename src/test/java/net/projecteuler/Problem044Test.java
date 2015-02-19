package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem044.solution;
import static net.projecteuler.Problem044.solutionBruteforce;

import org.junit.Test;

public class Problem044Test {

	@Test
	public void testSolution() throws Exception {
		// given
		double time = nanoTime();

		// when
		long result = solution();

		// then
		checkResult("044", 0L, result, time);
	}

	@Test
	public void testSolutionBruteforce() throws Exception {
		// given
		double time = nanoTime();

		// when
		long result = solutionBruteforce();

		// then
		checkResult("044", "brute force ", 5482660L, result, time);
	}
}

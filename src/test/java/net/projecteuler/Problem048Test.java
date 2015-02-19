package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem048.solution;
import static net.projecteuler.Problem048.solutionBruteforce;

import org.junit.Test;

public class Problem048Test {

	@Test
	public void testSolution() throws Exception {
		// given
		double time = nanoTime();

		// when
		long result = solution();

		// then
		checkResult("048", 0L, result, time);
	}

	@Test
	public void testSolutionBruteforce() throws Exception {
		// given
		double time = nanoTime();

		// when
		long result = solutionBruteforce(1000);

		// then
		checkResult("048", "brute force ", 9110846700L, result, time);
	}
}

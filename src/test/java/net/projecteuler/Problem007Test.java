package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem007.solution;
import static net.projecteuler.Problem007.solutionBruteforce;

import org.junit.Test;

public class Problem007Test {

	private static final int LIMIT = 10001;

	@Test
	public void testSolution() throws Exception {
		// given
		double time = nanoTime();

		// when
		long result = solution(LIMIT);

		// then
		checkResult("007", 104743L, result, time);
	}

	@Test
	public void testSolutionBruteforce() throws Exception {
		// given
		double time = nanoTime();

		// when
		long result = solutionBruteforce(LIMIT);

		// then
		checkResult("007", "brute force ", 104743L, result, time);
	}
}

package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem045.solution;
import static net.projecteuler.Problem045.solutionBruteforce;

import org.junit.Test;

public class Problem045Test {

	@Test
	public void testSolution() throws Exception {
		// given
		double time = nanoTime();

		// when
		long result = solution(285, 165, 143);

		// then
		checkResult("045", 1533776805L, result, time);
	}

	@Test
	public void testSolutionBruteforce() throws Exception {
		// given
		double time = nanoTime();

		// when
		long result = solutionBruteforce(285, 165, 143);

		// then
		checkResult("045", "brute force ", 1533776805L, result, time);
	}
}

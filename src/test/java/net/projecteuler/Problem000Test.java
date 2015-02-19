package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem000.solution;
import static net.projecteuler.Problem000.solutionBruteforce;

import org.junit.Test;

public class Problem000Test {

	@Test
	public void testSolution() throws Exception {
		// given
		double time = nanoTime();
		
		// when
		long result = solution();
		
		// then
		checkResult("000", 0L, result, time);
	}

	@Test
	public void testSolutionBruteforce() throws Exception {
		// given
		double time = nanoTime();
		
		// when
		long result = solutionBruteforce();
		
		// then
		checkResult("000", "brute force ", 0L, result, time);
	}
}

package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem000.solution;
import static net.projecteuler.Problem000.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem000Test {

	@Test
	public void testSolution() throws Exception {
		double time = nanoTime();
		long result = solution();
		System.out.println("[000] solution (" + result + ") in "
				+ (nanoTime() - time) / 1000000 + " milliseconds.");
		assertEquals(0L, result);
	}

	@Test
	public void testSolutionBruteforce() throws Exception {
		double time = nanoTime();
		long result = solutionBruteforce();
		System.out.println("[000] brute force solution (" + result + ") in "
				+ (nanoTime() - time) / 1000000 + " milliseconds.");
		assertEquals(1L, result);
	}
}

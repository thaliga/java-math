package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem005.solution;
import static net.projecteuler.Problem005.solutionBruteforce;

import org.junit.Test;

public class Problem005Test {
	@Test
	public void testSolutionBruteForceFor10() throws Exception {
		int value = 10;
		double time = nanoTime();
		long result = solutionBruteforce(value);
		checkResult("005", "10: brute force ", 2520L, result, time);
	}

	@Test
	public void testSolutionBruteForceFor20() throws Exception {
		int value = 20;
		double time = nanoTime();
		long result = solutionBruteforce(value);
		checkResult("005", "20: brute force ", 232792560L, result, time);
	}

	@Test
	public void testSolutionFor10() throws Exception {
		int value = 10;
		double time = nanoTime();
		long result = solution(value);
		checkResult("005", "10: ", 2520L, result, time);
	}

	@Test
	public void testSolutionFor20() throws Exception {
		int value = 20;
		double time = nanoTime();
		long result = solution(value);
		checkResult("005", "20: ", 232792560L, result, time);
	}
}

package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem006.solution;
import static net.projecteuler.Problem006.solutionBruteforce;

import org.junit.Test;

public class Problem006Test {
	@Test
	public void testSolutionFor10() throws Exception {
		// given
		long value = 10L;
		double time = nanoTime();

		// when
		long result = solution(value);

		// then
		checkResult("006", " 10: ", 2640L, result, time);
	}

	@Test
	public void testSolutionFor100() throws Exception {
		// given
		long value = 100L;
		double time = nanoTime();

		// when
		long result = solution(value);

		// then
		checkResult("006", "100: ", 25164150L, result, time);
	}

	@Test
	public void testSolutionBruteforceFor10() throws Exception {
		// given
		long value = 10L;
		double time = nanoTime();

		// when
		long result = solutionBruteforce(value);

		// then
		checkResult("006", " 10: brute force ", 2640L, result, time);
	}

	@Test
	public void testSolutionBruteforceFor100() throws Exception {
		// given
		long value = 100L;
		double time = nanoTime();

		// when
		long result = solutionBruteforce(value);

		// then
		checkResult("006", "100: brute force ", 25164150L, result, time);
	}
}

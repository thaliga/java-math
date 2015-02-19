package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem019.solution;

import org.junit.Test;

public class Problem019Test {

	@Test
	public void testSolution() throws Exception {
		// given
		double time = nanoTime();

		// when
		long result = solution();
		
		// then
		checkResult("019", "brute force ", 171L, result, time);
	}
}

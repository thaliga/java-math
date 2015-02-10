package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem019.solution;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem019Test {

	@Test
	public void testSolution() throws Exception {
		double time = nanoTime();
		long result = solution();
		System.out.println("[000] solution (" + result + ") in "
				+ (nanoTime() - time) / 1000000 + " milliseconds.");
		assertEquals(171L, result);
	}
}

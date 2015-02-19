package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem028.solution;

import org.junit.Test;

public class Problem028Test {

	@Test
	public void testSolution3() throws Exception {
		doTestSolution(3, 25L);
	}

	@Test
	public void testSolution5() throws Exception {
		doTestSolution(5, 101L);
	}

	@Test
	public void testSolution1001() throws Exception {
		doTestSolution(1001, 669171001L);
	}

	private void doTestSolution(int size, long expected) {
		// given
		double time = nanoTime();

		// when
		long result = solution(size);

		// then
		checkResult("028", expected, result, time);
	}
}

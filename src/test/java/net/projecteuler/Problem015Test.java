package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem015.solution;
import static net.projecteuler.Problem015.solutionBruteforce;

import org.junit.Test;

public class Problem015Test {

	public void doTestSolution(int n, long expected) {
		// given
		double time = nanoTime();
	
		// when
		long result = solution(n);
	
		// then
		checkResult("015", expected, result, time);
	}

	@Test
	public void testSolution2() throws Exception {
		doTestSolution(2, 2L);
	}

	@Test
	public void testSolution3() throws Exception {
		doTestSolution(3, 6L);
	}

	@Test
	public void testSolution4() throws Exception {
		doTestSolution(4, 20L);
	}

	@Test
	public void testSolution5() throws Exception {
		doTestSolution(5, 70L);
	}

	@Test
	public void testSolution6() throws Exception {
		doTestSolution(6, 252L);
	}

	@Test
	public void testSolution20() throws Exception {
		doTestSolution(20, 35345263800L);
	}

	public void doTestSolutionBruteforce(int n, long expected) {
		// given
		double time = nanoTime();

		// when
		long result = solutionBruteforce(n);

		// then
		checkResult("015", "brute force ", expected, result, time);
	}

	@Test
	public void testSolutionBruteforceFor2() throws Exception {
		doTestSolutionBruteforce(2, 2L);
	}

	@Test
	public void testSolutionBruteforceFor3() throws Exception {
		doTestSolutionBruteforce(3, 6L);
	}

	@Test
	public void testSolutionBruteforceFor4() throws Exception {
		doTestSolutionBruteforce(4, 20L);
	}

	@Test
	public void testSolutionBruteforceFor5() throws Exception {
		doTestSolutionBruteforce(5, 70L);
	}

	@Test
	public void testSolutionBruteforceFor6() throws Exception {
		doTestSolutionBruteforce(6, 252L);
	}

	@Test
	public void testSolutionBruteforceFor20() throws Exception {
		doTestSolutionBruteforce(20, 35345263800L);
	}
}

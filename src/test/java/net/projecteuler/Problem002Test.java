package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem002.solutionBruteforce;
import static net.projecteuler.Problem002.solutionElegant;

import org.junit.Test;

public class Problem002Test {

	@Test
	public void testSolutionBruteforce() throws Exception {
		double time = nanoTime();
		long result = solutionBruteforce();
		checkResult("002", "brute force ", 4613732L, result, time);
	}

	@Test
	public void testSolutionElegant() throws Exception {
		double time = nanoTime();
		long result = solutionElegant();
		checkResult("002", 4613732L, result, time);
	}
}

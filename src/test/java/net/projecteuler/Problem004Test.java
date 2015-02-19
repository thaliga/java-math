package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem004.solutionBruteforce;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem004Test {
	@Test
	public void testPalindrome() throws Exception {
		assertEquals(true, Problem004.isPalindrome(1001));
		assertEquals(true, Problem004.isPalindrome(121));
		assertEquals(false, Problem004.isPalindrome(1212));
		assertEquals(false, Problem004.isPalindrome(10));
	}

	@Test
	public void testSolutionBruteforce2Digits() throws Exception {
		// given
		long value = 2L;
		double time = nanoTime();
		
		// when
		long result = solutionBruteforce(value);
		
		// then
		checkResult("004", "2 digits: brute force ", 9009L, result, time);
	}

	@Test
	public void testSolutionBruteforceFor3Digits() throws Exception {
		// given
		long value = 3L;
		double time = nanoTime();
		
		// when
		long result = solutionBruteforce(value);
		
		// then
		checkResult("004", "3 digits: brute force ", 906609L, result, time);
	}
}

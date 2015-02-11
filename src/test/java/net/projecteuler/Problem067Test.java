package net.projecteuler;

import static java.lang.System.nanoTime;
import static net.projecteuler.Problem067.solution;
import static org.junit.Assert.assertEquals;

import java.io.InputStream;

import org.junit.Test;

import common.Util;

public class Problem067Test {

	@Test
	public void testSolution() throws Exception {
		double time = nanoTime();
		InputStream inputStream = Util.loadResource(getClass(), "Problem067.input");
		long result = solution(inputStream);
		System.out.println("[000] solution (" + result + ") in "
				+ (nanoTime() - time) / 1000000 + " milliseconds.");
		assertEquals(7273L, result);
	}
}

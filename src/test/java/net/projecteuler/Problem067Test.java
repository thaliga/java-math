package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem067.solution;

import java.io.InputStream;

import org.junit.Test;

import common.Util;

public class Problem067Test {

	@Test
	public void testSolution() throws Exception {
		// given
		double time = nanoTime();
		InputStream inputStream = Util.loadResource(getClass(),
				"Problem067.input");

		// when
		long result = solution(inputStream);

		// then
		checkResult("067", 7273L, result, time);
	}
}

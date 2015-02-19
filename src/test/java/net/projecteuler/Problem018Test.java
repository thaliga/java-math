package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem018.solution;
import static org.junit.Assert.assertEquals;

import java.io.InputStream;
import java.util.ArrayList;

import org.junit.Test;

import common.Util;

public class Problem018Test {

	@Test
	public void testSolution() throws Exception {
		// given
		double time = nanoTime();
		InputStream inputStream = Util.loadResource(getClass(),
				"Problem018.input");

		// when
		long result = solution(inputStream);

		// then
		checkResult("018", 1074L, result, time);
	}

	@Test
	public void processLine_oneLine() throws Exception {
		// given
		Problem018 p = new Problem018();

		// when
		ArrayList<Long> sums = p.processLine("3");

		// then
		assertEquals(1, sums.size());
		assertEquals(3L, (long) sums.get(0));
		assertEquals(3L, p.getResult());
	}

	@Test
	public void processLine_twoLines() throws Exception {
		// given
		Problem018 p = new Problem018();

		// when
		p.processLine("3");
		ArrayList<Long> sums = p.processLine("7 4");

		// then
		assertEquals(2, sums.size());
		assertEquals(10L, (long) sums.get(0));
		assertEquals(7L, (long) sums.get(1));
		assertEquals(10L, p.getResult());
	}

	@Test
	public void processLine_threeLines() throws Exception {
		// given
		Problem018 p = new Problem018();

		// when
		p.processLine("3");
		p.processLine("7 4");
		ArrayList<Long> sums = p.processLine("2 4 6");

		// then
		assertEquals(3, sums.size());
		assertEquals(12L, (long) sums.get(0));
		assertEquals(14L, (long) sums.get(1));
		assertEquals(13L, (long) sums.get(2));
		assertEquals(14L, p.getResult());
	}

	@Test
	public void testSolution_mini() throws Exception {
		// given
		InputStream inputStream = Util.loadResource(getClass(),
				"Problem018.mini.input");

		// when
		long result = solution(inputStream);

		// then
		assertEquals(23L, result);
	}
}

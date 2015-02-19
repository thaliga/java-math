package common;

import static java.lang.System.nanoTime;
import static org.junit.Assert.assertEquals;

public class TestUtil {

	public static <T> void checkResult(String name, T expected, T result,
			double time) {
		TestUtil.checkResult(name, "", expected, result, time);
	}

	public static <T> void checkResult(String name, String extension,
			T expected, T result, double time) {
		System.out.println("[" + name + "] " + extension + "solution ("
				+ result + ") in " + (nanoTime() - time) / 1000000
				+ " milliseconds.");
		assertEquals(expected, result);
	}
}

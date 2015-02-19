
package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem016.solution;

import org.junit.Test;

public class Problem016Test {

    private void doTestSolution(int power, long expected) {
		// given
    	double time = nanoTime();
    	
    	// when
		long result = solution(power);
		
		// then
		checkResult("016", "brute force ", expected, result, time);
	}

	@Test
    public void testSolution0() throws Exception {
    	doTestSolution(0, 1L);
    }

	@Test
    public void testSolution3() throws Exception {
    	doTestSolution(3, 8L);
    }

    @Test
    public void testSolution5() throws Exception {
    	doTestSolution(5, 5L);
    }

    @Test
    public void testSolution1000() throws Exception {
    	doTestSolution(1000, 1366L);
    }
}

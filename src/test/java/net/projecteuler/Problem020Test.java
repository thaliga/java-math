
package net.projecteuler;

import static common.TestUtil.checkResult;
import static java.lang.System.nanoTime;
import static net.projecteuler.Problem020.solutionBruteforce;

import org.junit.Test;

public class Problem020Test {

    @Test
    public void testSolutionBruteforce() throws Exception {
        // given
    	double time = nanoTime();
        
        // when
        long result = solutionBruteforce();
		
		// then
		checkResult("020", "brute force ", 648L, result, time);
    }
}

package net.projecteuler;

import static java.lang.System.nanoTime;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.math.BigInteger;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class UtilTest {

	@Test
	public void testFibonacciNumbersSum() {
		int n = 33;
		long sum1 = Util.sumFibonacciNumbers(n);
		long sum2 = 0;
		for (int i = 1; i <= n; ++i) {
			sum2 = Util.sumFibonacciNumbers(i);
		}
		assertEquals(sum1, sum2);
	}

	@Test
	public void testFindFibonacciIndex() {
		long n = 4000000L;
		int index = Util.findFibonacciIndex(n);
		assertEquals(33, index);
	}

	@Test
	public void testFindFibonacciNumber() throws Exception {
		int index = 33;
		long fn = Util.findFibonacciNumber(index);
		assertEquals(3524578L, fn);
	}

	@Test
	public void testLkkt() {
		assertEquals(6, Util.lkkt(2, 3));
		assertEquals(240, Util.lkkt(48, 80));
		assertEquals(1800, Util.lkkt(360, 225));
	}

	@Test
	public void testLnko() {
		assertEquals(1, Util.lnko(2, 3));
		assertEquals(16, Util.lnko(48, 80));
		assertEquals(45, Util.lnko(360, 225));
	}

	@Test
	public void testPrimeChecker() throws Exception {
		Util.Prime.Checker checker = new Util.Prime.CheckerWith6n();
		double time = nanoTime();

		final int NUMBER_OF_TESTS = 8;

		assertThat(checker.isPrime(2), CoreMatchers.is(true));
		assertThat(checker.isPrime(3), CoreMatchers.is(true));
		assertThat(checker.isPrime(5), CoreMatchers.is(true));
		assertThat(checker.isPrime(7), CoreMatchers.is(true));

		assertThat(checker.isPrime(4), CoreMatchers.is(false));
		assertThat(checker.isPrime(9), CoreMatchers.is(false));
		assertThat(checker.isPrime(51), CoreMatchers.is(false));
		assertThat(checker.isPrime(111), CoreMatchers.is(false));

		System.out.println("CheckWith6N prime checker average test time "
				+ (nanoTime() - time) / 1000000 / NUMBER_OF_TESTS
				+ " milliseconds.");
	}

	@Test
	public void testPrimesUnder() throws Exception {
		int value = 20;
		double time = nanoTime();
		int[] result = Util.Prime.primesUnder(value);
		System.out.println("Primes under " + value + ": " + (nanoTime() - time)
				/ 1000000 + " milliseconds.");
		assertThat(result,
				CoreMatchers.equalTo(new int[] { 2, 3, 5, 7, 11, 13, 17, 19 }));
	}

	@Test
	public void testSumOfDigits() throws Exception {
		assertEquals(0, Util.sumOfDigits(new BigInteger("0")));
		assertEquals(3, Util.sumOfDigits(new BigInteger("111")));
		assertEquals(27, Util.sumOfDigits(new BigInteger("999")));
		assertEquals(1, Util.sumOfDigits(new BigInteger("1000")));
		assertEquals(1, Util.sumOfDigits(new BigInteger("-1000")));
	}

	@Test
	public void testIsPentagonal() throws Exception {
		assertEquals(true, Util.isPentagonal(1));
		assertEquals(true, Util.isPentagonal(5));
		assertEquals(true, Util.isPentagonal(12));
		assertEquals(true, Util.isPentagonal(22));
		assertEquals(true, Util.isPentagonal(35));
		assertEquals(false, Util.isPentagonal(40));
	}

	@Test
	public void testCountDivisors() throws Exception {
		assertEquals(1, Util.countDivisors(1));
		assertEquals(2, Util.countDivisors(2));
		assertEquals(2, Util.countDivisors(3));
		assertEquals(3, Util.countDivisors(4));
		assertEquals(2, Util.countDivisors(5));
		assertEquals(4, Util.countDivisors(6));
		assertEquals(2, Util.countDivisors(7));
		assertEquals(4, Util.countDivisors(8));
		assertEquals(3, Util.countDivisors(9));
		assertEquals(5, Util.countDivisors(16));
		assertEquals(6, Util.countDivisors(28));
	}
}

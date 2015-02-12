package common;


public class Primes {

	public static int[] primes(final int numberOfPrimes) {
		return new PrimeGenerator() {
			@Override
			protected boolean stopCondition(int number) {
				return getPrimes().size() >= numberOfPrimes;
			}
		}.generate();
	}

	public static int[] primesUnder(final int n) {
		return new PrimeGenerator() {
			@Override
			protected boolean stopCondition(int number) {
				return number >= n;
			}
		}.generate();
	}
}
package common;

import static java.lang.Math.floor;
import static java.lang.Math.log;
import static java.lang.Math.sqrt;

public class PrimeFactors {
	final private int number;
	final private int[] p;

	PrimeFactors(int number) {
		this.number = number;
		int limit = (int) sqrt(number);
		p = Primes.primesUnder(limit);
	}

	public int getNumber() {
		return number;
	}

	public int getNumberOfPrimes() {
		return p.length;
	}

	private int getPowerOfPrimeAt(int n, int i) {
		return (int) floor(log(n) / log(p[i]));
	}

	public int[] getPowers(int n) {
		int numberOfPrimes = getNumberOfPrimes();
		int[] a = new int[numberOfPrimes];
		for (int i = 0; i < numberOfPrimes - 1; ++i) {
			a[i] = getPowerOfPrimeAt(n, i);
		}
		return a;
	}

	public int[] getPrimes() {
		return p;
	}
}
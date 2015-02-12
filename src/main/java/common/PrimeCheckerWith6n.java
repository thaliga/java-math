package common;

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

public class PrimeCheckerWith6n implements PrimeChecker {
	@Override
	public boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		if (n < 4) {
			return true; // 2 and 3 are prime
		}
		if (n % 2 == 0) {
			return false;
		}
		if (n < 9) {
			return true; // we have already excluded 4,6 and 8.
		}
		if (n % 3 == 0) {
			return false;
		}
		int r = (int) floor(sqrt(n));
		int f = 5;
		while (f <= r) {
			if (n % f == 0) {
				return false;
			}
			if (n % (f + 2) == 0) {
				return false;
			}
			f = f + 6;
		}
		return true;
	}
}
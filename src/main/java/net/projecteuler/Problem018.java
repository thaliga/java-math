package net.projecteuler;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import common.Util;

public class Problem018 {

	private final ArrayList<Long> sumArray = new ArrayList<Long>();

	public static long solution(InputStream inputStream) {
		Problem018 p = new Problem018();
		Scanner scanner = new Scanner(inputStream);
		while (scanner.hasNextLine()) {
			p.processLine(scanner.nextLine());
		}
		scanner.close();
		return p.getResult();
	}

	ArrayList<Long> processLine(String nextLine) {
		ArrayList<Long> numbers = Util.convertToNumbers(nextLine);
		if (numbers.size() != sumArray.size() + 1) {
			throw new RuntimeException();
		}
		if (sumArray.size() == 0) {
			sumArray.add(numbers.get(0));
		} else {
			sumArray.add(sumArray.get(sumArray.size() - 1)
					+ numbers.get(numbers.size() - 1));
			for (int i = sumArray.size() - 2; i > 0; --i) {
				long a = sumArray.get(i - 1) + numbers.get(i);
				long b = sumArray.get(i) + numbers.get(i);
				sumArray.set(i, Math.max(a, b));
			}
			sumArray.set(0, sumArray.get(0) + numbers.get(0));
		}
		return sumArray;
	}

	long getResult() {
		return Collections.max(sumArray);
	}
}

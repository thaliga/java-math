package net.projecteuler;

import common.Util;

public class Problem019 {

	public static long solution() {
		int[] lenghtOfMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int dow = 1;
		int countSundays = 0;
		for (int year = 1900; year < 2001; ++year) {
			for (int month = 1; month <= 12; ++month) {
				dow = dow + lenghtOfMonths[month-1];
				if (month == 2 && Util.isLeapYear(year)) {
					dow += 1;
				}
				dow = dow % 7;
				if (year > 1900) {
					if (dow == 0) {
						countSundays += 1;
					}
				}
			}
		}
		return countSundays;
	}
}

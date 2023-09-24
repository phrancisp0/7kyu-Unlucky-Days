import java.util.Calendar;

public class Kata {
	public static int unluckyDays(int year) {
		int result = 0;
		Calendar cal = Calendar.getInstance();

		for (int i = 0; i < 12; i++) {
			cal.set(year, i, 13, 0, 0);
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
				result++;
			}
		}
		return result;
	}
}
/*
Friday 13th or Black Friday is considered as unlucky day. Calculate how many unlucky days are in the given year.

Find the number of Friday 13th in the given year.

Input: Year in Gregorian calendar as integer.

Output: Number of Black Fridays in the year as an integer.

Examples:

unluckyDays(2015) == 3
unluckyDays(1986) == 1
*/
package bridgeLAbz;

import java.util.Scanner;

public class LeapYear {
	void toCheckLeapYear() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter year:");
		int year = s.nextInt();
		if ((year % 4 == 0) || (year % 400 == 0)) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not leap year");
		}
		s.close();
	}

	public static void main(String[] args) {
		LeapYear objLeapYear = new LeapYear();
		objLeapYear.toCheckLeapYear();

	}

}

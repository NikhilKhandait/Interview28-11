package practical_JavaBasics;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {

	public static void main(String[] args) {

		LocalDate ldate = LocalDate.now();
		LocalDate ldate2 = ldate.of(2001, 10, 8);
		Period p = Period.between(ldate2, ldate);

		System.out.println(p.getYears());

		/* for cheaking with Month & Date */
		
		// System.out.println(p.getMonths());
		// System.out.println(p.getDays());

	}
}

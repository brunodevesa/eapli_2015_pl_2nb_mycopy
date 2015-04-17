/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.mymoney.domain;

import java.util.Calendar;

public final class DateTime {

	public static Period thisWeek() {
		Calendar now = eapli.util.DateTime.now();
		int weekNumber = eapli.util.DateTime.currentWeekNumber();
		int year = now.get(Calendar.YEAR);

		Calendar begin = eapli.util.DateTime.beginningOfWeek(year, weekNumber);
		Calendar end = now;

		Period period = new Period(begin, end);

		return period;
	}

}
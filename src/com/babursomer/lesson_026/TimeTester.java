package com.babursomer.lesson_026;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeTester {
	public static void main(String[] args) {
		System.out.println("\nYerel zaman                : " + LocalTime.now().toString());
		System.out.println("\nYerel tarih ve zaman       : " + LocalDateTime.now().toString());
		System.out.println("\nSaat dilimli tarih ve zaman: " + ZonedDateTime.now().toString());
		System.out.println("\nOfsetli zaman              : " + OffsetTime.now().toString());
		System.out.println("\nOfsetli tarih ve zaman     : " + OffsetDateTime.now().toString());
		System.out.println("\nAy ve gün                  : " + MonthDay.now().toString());
		System.out.println("\nYıl ve ay                  : " + YearMonth.now().toString());
		System.out.println("\nAnlık                      : " + Instant.now().toString());
		
		System.out.println("\nYerel zaman (CET)          : " + LocalTime.now(ZoneId.of("CET")).toString());
		
		System.out.println("\nYerel zaman                : " + LocalTime.now().toString());
		
		LocalDate d = LocalDate.parse("2021-10-11");
		
		// System.out.println(d.);
		System.out.println(d.toString());
	}
}

package com.babursomer.lesson_026;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import com.util.BAUtils;

public class BirthdayInfo {
	
	public static void main(String[] args) {
		
		BAUtils.header("Gereksiz Doğumgünü Bilgileri");
		DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
		DateTimeFormatter shortFormat = DateTimeFormatter.ofPattern("MMMM dd");
		DateTimeFormatter inpuFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		do {
			System.out.println("Bugün, " + LocalDate.now().format(fullFormat) + "\n");
			
			// String aDate = BAUtils.readString("Lütfen doğum gününüzü (YYYY-MM-dd)
			// formatında giriniz");
			// LocalDate birthDay = LocalDate.parse(aDate);
			String aDate = BAUtils.readString("Lütfen doğum gününüzü (dd.mm.yyyy) formatında giriniz");
			LocalDate birthDay = LocalDate.parse(aDate, inpuFormat);
			
			if (birthDay.isAfter(LocalDate.now())) {
				System.err.println("Daha doğmadınız");
				continue;
			}
			
			System.out.println("---- Bilgiler ----");
			System.out.println(birthDay.format(fullFormat) + " harika bir gündü.");
			System.out.println("Bir " + birthDay.getDayOfWeek() + " günü doğdunuz");
			
			long days = birthDay.until(LocalDate.now(), ChronoUnit.DAYS);
			long weeks = birthDay.until(LocalDate.now(), ChronoUnit.WEEKS);
			long months = birthDay.until(LocalDate.now(), ChronoUnit.MONTHS);
			long years = birthDay.until(LocalDate.now(), ChronoUnit.YEARS);
			long decades = birthDay.until(LocalDate.now(), ChronoUnit.DECADES);
			long mileniums = birthDay.until(LocalDate.now(), ChronoUnit.MILLENNIA);
			System.out.println("Bugüne dek " + days + " gün, " + weeks + " hafta, " + months + " ay, " + years
					+ " yıl, " + decades + " onyıl ve " + mileniums + " binyıl yaşadınız");
			;
			
			LocalDate nextBDate = birthDay.plusYears(years + 1);
			System.out.println("Bir sonraki doğum gününüz " + nextBDate.format(fullFormat));
			System.out.println(
					"Kutlamaya daha " + LocalDate.now().until(nextBDate, ChronoUnit.DAYS) + " gün beklemeniz gerekli");
			
			LocalDate halfBDate = birthDay.plusMonths(6);
			System.out.println("Yarım yaşlarınızı " + halfBDate.format(shortFormat) + " tarihinde kutluyorsunuz");
			
		} while (BAUtils.wantToEnd("Bir daha (Evet/Hayır)?", "Hayır"));
		
		BAUtils.footer();
	}
}

package com.babursomer.lesson_030;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalGlobal {
	
	public static void main(String[] args) {
		Locale locale = new Locale("tr");
		ResourceBundle languageBundle = ResourceBundle.getBundle("com.bilgeadam.boost.java.lesson30.texts", locale);
		
		Locale localeEng = new Locale("en");
		ResourceBundle languageBundleEn = ResourceBundle.getBundle("com.bilgeadam.boost.java.lesson30.texts",
				localeEng);
		
		Locale localeEngUS = new Locale("en", "US");
		ResourceBundle languageBundleEnUS = ResourceBundle.getBundle("com.bilgeadam.boost.java.lesson30.texts",
				localeEngUS);
		
		System.out.println(languageBundle.getString("LocalGlobal.HELLO"));
		System.out.println(languageBundleEn.getString("LocalGlobal.HELLO"));
		System.out.println(languageBundleEnUS.getString("LocalGlobal.HELLO"));
		
		System.out.println(languageBundle.getString("LocalGlobal.BYE"));
		System.out.println(languageBundleEn.getString("LocalGlobal.BYE"));
		System.out.println(languageBundleEnUS.getString("LocalGlobal.BYE"));
		
		DateFormat dF = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, localeEngUS);
		System.out.println(dF.format(new Date()));
		
		DateFormat dF1 = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, locale);
		System.out.println(dF1.format(new Date()));
	}
	
}

package com.util;

public class BilgeAdamUtilsTest {
	
	public static void main(String[] args) {
		
		System.out.println(BAUtils.dateAsString(Long.parseLong("1632646800")));
		System.out.println(BAUtils.timeAsString(Long.parseLong("1632646800")));
		System.out.println("Enlem / Boylam Sorgusu : " + BAUtils.getDirectData("Edremit", "Balıkesir", "TR"));
		System.out.println("Günlük Hava Raporu     : " + BAUtils.getWeatherData(39.5961, 22.0244));
		System.out.println("15 Saatlik Hava Raporu : " + BAUtils.getForecastData("Edremit", "Balıkesir", "TR"));
		System.out.println("Hava Kirlilik Raporu   :" + BAUtils.getPolutionData(39.5961, 22.0244));
		
		// BAUtils.header("oldu mu?");
		// boolean proceeding = true;
		// do {
		// String str = BAUtils.readString("Lütfen bir değer giriniz");
		// System.out.println("Okunan değer: " + str);
		//
		// int j = BAUtils.readInt("Lütfen bir tam sayı giriniz");
		// System.out.println("Okunan değer: " + j);
		//
		// double d = BAUtils.readDouble("Lütfen bir virgüllü sayı giriniz");
		// System.out.println("Okunan değer: " + d);
		//
		// int[] inputs = BAUtils.readInt("Lütfen ", "tam sayı giriniz", 4);
		//
		// for (int i = 0; i < inputs.length; i++) {
		// System.out.println(i + ". girilen değer: " + inputs[i]);
		// }
		//
		// proceeding = BAUtils.proceeding("Devam etmek istiyor musunuz? (Evet /
		// Hayır)", "Hayır");
		// } while (!proceeding);
		
		// boolean proceed = BAUtils.proceeding("Devam etmek istiyor musunuz) (Evet /
		// Hayır)", "Evet");
		// System.out.println("Okunan değer: " + proceed);
		// int[] ints = BAUtils.readInt("Lütfen", "adet tam sayı giriniz", 10);
		// System.out.println("Okunan değer: " + ints);
		
		// BAUtils.footer();
		
	}
	
}

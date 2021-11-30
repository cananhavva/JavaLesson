package com.babursomer.lesson_030;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ChangeLetters {
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			boolean correctInput = true;
			
			do {
				try {
					System.out.print("Lütfen sayı giriniz: ");
					// int readValue = scan.nextInt();
					// correctInput = true;
					System.out.print("Lütfen içinde sadece sayı ve sembol olan bir metin giriniz: ");
					String str = scan.next();
					checkInput(str);
				} catch (Exception ex) {
					System.out.println("Hatalı giriş");
					correctInput = false;
				} finally {
					scan.nextLine();
				}
			} while (!correctInput);
			System.out.println("bay bay");
		}
		// Map<String, String> changedText = changeTRCharecter("yapılandırıcıya ve
		// değişkenlere sahiptir");
		// System.out.println("Değişen harf adedi: " + changedText.get("COUNT"));
		// System.out.println("Türkçe karaktersiz metin: " + changedText.get("VALUE"));
	}
	
	private static void checkInput(String str) throws Exception {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 65 && chars[i] <= 122) {
				throw new Exception();
			}
		}
	}
	
	/**
	 * COUNT = değişilik sayısı VALUE = Yeni Metin sayısı
	 *
	 * @param msg
	 * @return
	 */
	public static Map<String, String> changeTRCharecter(String msg) {
		final List<Character> trKey = Arrays.asList('ö', 'ç', 'ş', 'ı', 'ğ', 'ü', 'Ö', 'Ç', 'Ş', 'İ', 'Ğ', 'Ü');
		final List<Character> enKey = Arrays.asList('o', 'c', 's', 'i', 'g', 'u', 'O', 'C', 'S', 'I', 'G', 'U');
		StringBuilder newStr = new StringBuilder();
		int count = 0;
		char[] charArray = msg.toCharArray();
		for (int i = 0; i < msg.length(); i++) {
			if (trKey.contains(charArray[i])) {
				newStr.append(enKey.get(trKey.indexOf(charArray[i])));
				count++;
			} else {
				newStr.append(charArray[i]);
			}
		}
		Map<String, String> map = new HashMap<>();
		map.put("COUNT", String.valueOf(count));
		map.put("VALUE", newStr.toString());
		return map;
	}
	
}

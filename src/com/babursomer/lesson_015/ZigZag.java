package com.babursomer.lesson_015;

import java.util.Arrays;

import com.util.BAUtils;

public class ZigZag {
	
	public static void main(String[] args) {
		String str = "BA Boost Java Öğrencileri En İyileri";
		int numberOfRows = 5;
		
		ZigZag zag = new ZigZag();
		
		BAUtils.header("ZIGZAG Example");
		
		String result = zag.convert(str, numberOfRows);
		System.out.println(result);
		
		BAUtils.footer();
	}
	
	/*
	 * 0) Eğer tek bir satıra bölmek gerekiyorsa veya satır adedi kelimenin
	 * uzunluğundan fazla ise, kelimeyi çağrıldığı yere iade et
	 * 1) satırAdedi kadar öğesi olan bir array oluştur
	 * 2) array'in tüm elemanlarını boş olarak tanımla
	 * 3) Girdi String'ini harf harf işleyebilmek için bir character array'e
	 * dönüştür
	 * 4) Satırlar arası dolaşabilmek için bir satır sayacı tanımla
	 * 5) Dolaşırken gidilen yönü belirlemek için bir yönBelirleyici tanımla
	 * 6) Girdi String'inden oluşturulmuş array'in her bir öğesini birer birer
	 * ziyaret et ve aşağıdaki işleri yap
	 * (a) Geçerli satırı içeren array öğesine geçerli karakteri ekleyin
	 * (b) Satır numarası n-1 ise, yönü 'yukarı' olarak değiştir (yani en dibe
	 * vardık)
	 * (c) Satır numarası 0 ise, yönü 'aşağı' olarak değiştir (yani en tepeye
	 * vardık)
	 * (d) Yön 'aşağı' ise, satır++ (bir alt satıra geç) yapın. Yoksa satır-- (bir
	 * üst satıra geç)
	 * 7) Tüm satır string'lerini birbirleri ile birleştir
	 */
	// TODO: NOT: Bunun akış diyagramını çizmeye çalışın!
	private String convert(String str, int numberOfRows) {
		String retVal = "";
		int len = str.length();
		
		if ((len <= numberOfRows) || (numberOfRows == 1))
			return str;
		
		String[] rows; // (1)
		rows = new String[numberOfRows];
		
		Arrays.fill(rows, ""); // (2)
		
		char[] chars = str.toCharArray(); // (3)
		// "BA Boost" ==> 'B', 'A', 'B', 'o', 'o', 's', 't' metni characterarray yaptık
		
		int row = 0; // (4)
		boolean goingDown = true; // (5)
		
		for (int i = 0; i < len; i++) { // (6) character array'in öğerlerini gez
			rows[row] += chars[i]; // (a) "" + 'x' {boş string + bir karakter, karacterden oluşan bir string
									// yaratır
			
			if (row == (numberOfRows - 1)) {// (b)
				goingDown = false;
			}
			
			if (row == 0) { // (c)
				goingDown = true;
			}
			
			if (goingDown) { // (d)
				row++;
			} else {
				row--;
			}
		}
		
		for (int i = 0; i < numberOfRows; i++) {// (7)
			retVal += rows[i];
		}
		return retVal;
	}
}

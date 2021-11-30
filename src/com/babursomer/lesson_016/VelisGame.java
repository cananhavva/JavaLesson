package com.babursomer.lesson_016;

public class VelisGame {
	
	public static void main(String[] args) {
		int numOfElements = 5000;
		boolean[] spints = new boolean[numOfElements];
		
		// ilk değer atama
		for (int i = 0; i < spints.length; i++) { // işi garantiye almak için. aslında array tanımlandığında zaten hepsi
													// false
			spints[i] = false; // tüm dolapları kapadık
		}
		
		// Velinin oyunu burada başlıyor
		for (int tour = 1; tour <= spints.length; tour++) { // tur sayısı ile atlanması gereken dolap sayısı aynı
			
			for (int spintCount = 0; spintCount < spints.length;) {
				
				spints[spintCount] = !spints[spintCount]; // mantıksal ters çevirme false ==> true ve true ==> false
				spintCount = spintCount + tour;
			}
		}
		
		// Açık kalan dolapları listeliyor ve açık dolap adedini sayıyor
		int openSpinCount = 0;
		for (int i = 0; i < spints.length; i++) { // açık kalan dolapları göster
			if (spints[i]) {
				System.out.print(i + "  ");
				openSpinCount++;
			}
		}
		System.out.println("\nAçık kalan dolap adedi: " + openSpinCount);
	}
}

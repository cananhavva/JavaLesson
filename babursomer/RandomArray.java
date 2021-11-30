package babursomer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	
	public static void main(String[] args) {
		// TODO
		System.out.println("Kaç Rastgele sayi tutulsun ?  ");
		Scanner scn = new Scanner(System.in);
		int sayi = scn.nextInt();
		
		int dizi[] = new int[sayi];
		
		Random rnd = new Random();
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = rnd.nextInt(10);
		}
		
		yazdir(dizi);
		kucukbul(dizi);
		buyukbul(dizi);
		ortalamabul(dizi);
		sirala(dizi);
	}
	
	public static void yazdir(int dizi[]) {
		for (int i = 0; i < dizi.length; i++) {
			System.out.println("Dizinin " + (i + 1) + ". elemanı = " + dizi[i]);
		}
	}
	
	public static void kucukbul(int dizi[]) {
		int enk;
		enk = dizi[0];
		
		for (int i = 1; i < dizi.length; i++) {
			if (dizi[i] < enk)
				enk = dizi[i];
		}
		
		System.out.println("Dizinin en kucuk elemani = " + enk);
	}
	
	public static void buyukbul(int dizi[]) {
		int enb;
		enb = dizi[0];
		
		for (int i = 1; i < dizi.length; i++) {
			if (dizi[i] > enb)
				enb = dizi[i];
		}
		
		System.out.println("Dizinin en buyuk elemani = " + enb);
	}
	
	public static void ortalamabul(int dizi[]) {
		int toplam = 0;
		
		for (int i = 0; i < dizi.length; i++) {
			
			toplam = toplam + dizi[i];
			
			if (i == dizi.length - 1) {
				double ortalama;
				ortalama = ortalama = toplam / dizi.length;
				System.out.println("Dizinin ortalamasi = " + ortalama);
			}
		}
	}
	
	public static void sirala(int dizi[]) {
		Arrays.sort(dizi);
		for (int i = 0; i < dizi.length; i++)
			System.out.println("Sıralanmış dizinin " + (i + 1) + ".elemanı " + dizi[i] + "'dir");
	}
	
}

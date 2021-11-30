package com.babursomer.lesson_017;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int len = rnd.nextInt(20);
		int[] array = new int[len];
		
		for (int i = 0; i < (len / 2); i++) {
			array[i] = rnd.nextInt(100);
		}
		
		for (int i = len / 2; i < len; i++) {
			System.out.print("Bir sayı: ");
			array[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println("Dizi öğeleri :" + Arrays.toString(array));
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int numOfEvens = 0;
		int sumEvens = 0;
		
		for (int i = 0; i < len; i++) {
			if ((array[i] % 2) == 0) {
				sumEvens += array[i];
				numOfEvens++;
			} else {
				if (min > array[i]) {
					min = array[i];
				}
				if (max < array[i]) {
					max = array[i];
				}
			}
		}
		
		System.out.println("En küçük tek sayı  : " + min);
		System.out.println("En büyük tek sayı  : " + max);
		System.out.println("Çift sayı adedi    : " + numOfEvens);
		System.out.println("Çift sayı ortalama : " + (sumEvens / numOfEvens));
		
	}
	
}

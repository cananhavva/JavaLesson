package babursomer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExamples {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] arr1 = new int[5];
		arr1[0] = 1;
		arr1[1] = 23;
		arr1[2] = 43;
		arr1[3] = 78;
		arr1[4] = 1;
		
		System.out.println("doğrudan erişim: " + arr1[3]);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Sırayla eski model erişim: " + arr1[i]);
			
		}
		for (int content : arr1) {
			System.out.println("Sırayla yeni model erişim: " + content);
			
		}
		for (int i = arr1.length - 1; i >= 0; i--) {
			System.out.println("Sırayla eski model tersten erişim: " + arr1[i]);
		}
		int[] arr2 = { 5, 25, 56, 63 };
		int[] arr3 = new int[5];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("Bir tam sayı değerini giriniz: " + arr3[i]);
			arr3[i] = scn.nextInt();
		}
		System.out.println();
		for (int content : arr2) {
			System.out.println(content);
		}
		
		Arrays.fill(arr2, 55);
		System.out.println();
		for (int content : arr2) {
			System.out.println(content);
		}
		int[][] thereeDimesional = new int[2][3];
		for (int x = 0; x < 2; x++) {
			for (int y = 0; y < 3; y++) {
				Random Random = new Random();
				thereeDimesional[x][y] = Random.nextInt();
				
				// for (int z=0; z<4; z++) {
				// thereeDimesional [x][y][z]= Random.nextInt();
				// }
			}
		}
		System.out.println(Arrays.deepToString(thereeDimesional));
		scn.close();
		
	}
}

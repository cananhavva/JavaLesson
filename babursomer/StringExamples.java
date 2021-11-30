package babursomer;

import java.util.Scanner;

public class StringExamples {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String input;
		String str = "";
		do {
			System.out.println("Bir metin giriniz: ");
			input = inp.nextLine();
			if (!input.endsWith("it")) {
				str += input;
				
			} else {
				break;
				
			}
			int idx = str.indexOf("ı");
			
			char[] chars = str.toCharArray();
			if (idx >= 0) {
				chars[idx] = 'i';
			}
			
			// str = new String(chars);
			// String spiltted[] = str.split("|");
			// for (String string : spiltted)
			
		} while (!input.equalsIgnoreCase("exit"));
		
		System.out.println(str.toString());
		inp.close();
		
	}
	
}

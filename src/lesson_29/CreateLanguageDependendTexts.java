package lesson_29;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CreateLanguageDependendTexts {
	
	public static void main(String[] args) {
		File configFile = new File(".\\config\\configurad.config");
		try {
			FileReader fR = new FileReader(configFile);
			BufferedReader bR = new BufferedReader(fR);
			// String language = bR.readLine();
			// System.out.println(language);
			bR.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
}

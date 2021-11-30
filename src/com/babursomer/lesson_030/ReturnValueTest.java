package com.babursomer.lesson_030;

import java.io.File;
import java.util.HashMap;

public class ReturnValueTest {
	
	public static void main(String[] args) {
		HashMap<String, Object> xxx = createFile();
		String str = (String) xxx.get("1");
		File file = (File) xxx.get("2");
	}
	
	static HashMap<String, Object> createFile() {
		File f = new File(
				"C:\\Users\\trs\\BilgeAdam\\Basic Concepts\\src\\com\\bilgeadam\\boost\\java\\lesson30\\animal.java");
		HashMap<String, Object> retVal = new HashMap<>();
		retVal.put("1", "lklş");
		retVal.put("2", f);
		return retVal;
	}
}

package LessonGayrimenkul;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataWriterExample {
	public static void main(String[] args) {
		double[] values = { 1.2, 23.45, 643.0, 9843.98 };
		File file = new File("C\\file\\canan.arslan\\values.ddd");
		try {
			FileOutputStream fos = FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			for (int i = 0; i < values.length; i++) {
				dos.writeDouble(values[i]);
			}
			dos.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
	private static FileOutputStream FileOutputStream(File file) {
		return null;
	}
	
}

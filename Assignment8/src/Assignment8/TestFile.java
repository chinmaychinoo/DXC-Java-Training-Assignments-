package Assignment8;

import java.io.File;
import java.io.IOException;

public class TestFile {
	
	public static void main(String ar[]) {
		
		File f1 = new File("G:\\File\\Badminton");
		f1.mkdir();
		
		
		File f2 = new File(f1, "Singles.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		File f3 = new File(f1, "Dubbles.txt");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		File f4 = new File(f1, "\\courts");
		f4.mkdir();
		
		File f5 = new File(f1,"Doubles.txt");
		f3.renameTo(f5);
		f2.delete();
		
	}
}
package Assignment8;

import java.io.File;

public class FolderInfo {
	
	
	static void printDirectory(String path){
		
		
		int c=0;
		File file1 = new File(path);
		File[] fileList = file1.listFiles();
		
		for (File file2 : fileList) {
			
			if (file2.isFile()) {

				System.out.println("File :"+file2.getName());
				System.out.println("Absolute Path :"+file2.getAbsolutePath());
				System.out.println("Folder Path :"+file2.getParent());
				c=1;
			}
			
			if(file2.isDirectory()) {
				System.out.println("Directory: "+file2.getName());
				System.out.println("Folder Path :"+file2.getParent());
				c=1;
			}
		}
		
		
		
		if(c==0)
			System.out.println("No Folder exists with the given name");
		
		
	}
	
	
	public static void main(String args[])
	{
		printDirectory("G:\\File\\Badminton");
	}

}
import java.io.File;
import java.io.IOException;

public class finfo{
	public static void main(String args[]){
			File f0 = new File("C:/Users/antri/Desktop/java/javafileoperation.txt");
			if(f0.exists()){
				System.out.println("The Name of the file is: " + f0.getName());
				System.out.println("The File Path is: " + f0.getAbsolutePath());
				System.out.println("Is this file Writable: " + f0.canWrite());
				System.out.println("Is this file Readable: " + f0.canRead());
				System.out.println("The Size of the File is: " + f0.length() + " Bytes.");
			}else{
				System.out.println("File is Not Available at this location.");
			}
		}
	}
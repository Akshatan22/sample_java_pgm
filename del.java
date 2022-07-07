import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class del{
	public static void main(String args[]){
		File f0 = new File("C:/Users/antri/Desktop/java/javafileoperation.txt");
		if(f0.delete()){
			System.out.println(f0.getName()+"File is deleted sucessfully.");
		}else{
			System.out.println("Unexpected Error");
		}
	}
}
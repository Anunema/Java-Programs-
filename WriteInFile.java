package Java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

	public static void main(String[] args) {
		String FilePath = "C:\\Users\\anune\\OneDrive\\Documents\\Calender.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(FilePath))){
			
			bw.write("hello its new line iam adding");
			System.out.println("added content");
			
			
		}catch(IOException e) {
			System.out.println("Error"+e.getMessage());
		}

	}

}

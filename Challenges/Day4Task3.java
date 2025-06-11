package Day5;

import java.io.FileWriter;
import java.io.IOException;

public class Day4Task3 {

	public static void main(String[] args) {
		try {
			FileWriter myWriter=new FileWriter ("C:\\Users\\casstudent\\Documents//day3 laptop task.txt");
			myWriter.write("computer science");
			myWriter.close();
			System.out.println("Succesfuly Wrote the line in  thb file...");
			
		}
		catch(IOException e) {
			System.out.println("an error occured ");
			e.printStackTrace();
		}
		
	}

}

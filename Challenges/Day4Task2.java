package Day5;

import java.io.*;

public class Day4Task2 {

	public static void main(String[] args) {
		String filename="C:\\Users\\casstudent\\Documents//day3 laptop task.txt";
	try (BufferedReader br=new BufferedReader(new FileReader(filename))){
		String Line;
		if((Line = br.readLine())!=null) {
			System.out.println(Line);
		}
		
	
	}
	catch(Exception e) {
		System.out.println("Filenotfound");
	}
}
}
package Day5;

import java.util.Scanner;

public class Day4Task1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		try {
			System.out.println("enter the number:");
			int number=in.nextInt();
		int total=10/number;
		System.out.println("total:"+total);
		}
		catch(Exception e) {
			System.out.println("Cannot divide with zero:"+e);
		}

	}

}

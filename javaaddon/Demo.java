package javaaddon;

import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
	System.out.println("Blood Donation");
	System.out.println("Enter your Age");
	Scanner in=new Scanner(System.in);
	int age=in.nextInt();
	System.out.println("enter your Weight");
	int wg=in.nextInt();
	if(age>=18 && wg>=50 ) {
		
		System.out.println("you are eligible for blood donation");
	}
	else {
		System.out.println("you are not eligible");
	}
}
}
package javaaddon;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		System.out.println("enter the amount");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		
		 if(a<=100000) {
			 System.out.println("enter the ATM pin:");
				int b=in.nextInt();
			 if(b==2004) {
				 System.out.println("Amount Withdrawn Succesfully:"+a);
			 }
			 else {
				 System.out.println("invalid PIN number");
			 }
		 }
		 else {
			 System.out.println("Insufficint Balance");
		 }
	}
	
	
		
	
}

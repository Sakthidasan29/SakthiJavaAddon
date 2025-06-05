package javaaddon;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		System.out.println("enter the starting value:");
		Scanner in =new Scanner(System.in);
	int a=in.nextInt();
	     System.out.println("enter the ending value:");
	     int b=in.nextInt();
	     for(int i=a;i<b;i++) {
	    	 if(i%2==0) {
	    		 System.out.println(i);
	    	 }
	     }

	}

}

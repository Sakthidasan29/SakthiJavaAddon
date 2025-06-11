package Challenges;

import java.util.Scanner;

public class Day2Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		String word=in.nextLine();
		System.out.println("Enter the String : "+word);
		
		int vowel=0,consonant=0;
		for (int i = 0; i < word.length(); i++) {
			char ch=word.charAt(i);
			  
			if (Character.isLetter(ch)) {
				
				if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowel++;
				}else  {
				
					consonant++;
				} 
			}			
		}		
				
		System.out.println("vowel  :"+vowel);
		System.out.println("consonant  :"+consonant);
		
		in.close();
		
	}
}


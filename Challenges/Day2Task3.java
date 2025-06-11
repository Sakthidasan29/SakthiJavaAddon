package Challenges;

//import java.util.Iterator;

public class Day2Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="i will improve my skill";
		
		String[] word=a.split("\\s+");
		System.out.println("Enter the String  : "+a);
		System.out.println("Split the word    :"+word.length);
		
		int charcount=a.replace(" ", " ").length();
		System.out.println("Enter the Character count   :"+charcount);
		
		String reverse=new StringBuilder(a).reverse().toString();
		System.out.println("Enter the Reversed   :"+reverse);
		
		String longest="";
		for (String words:word) {
			if (words.length()>longest.length()) {
				longest=words;
			}
		}
		
		System.out.println("longest word   :"+longest);
		
		System.out.println("---String analyzer---");
		
		String[] name= {"joe","walton","john"};
		String[] num = {"111-coimbatore","222-chennai","333-madhurai"};
		
		for (int i = 0; i < name.length; i++) {
			System.out.println((i+1)+" ."+name[i]+" ."+num[i]);
		}
		
	}

}

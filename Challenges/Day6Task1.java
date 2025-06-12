package Day6;

import java.util.ArrayList;

public class Day5Task1 {

	public static void main(String[] args) {
	ArrayList<String> arr=new ArrayList<String>();
	arr.add("Mahii");
	arr.add("A");
	arr.add("Computer Technology");
	arr.add("3rd  Year");
	arr.add("KGCAS");
	arr.set(4, "KG COLLEGE OF ARTS AND SCIENCE");
	System.out.println(arr.get(3));

	for(String data:arr) {
		System.out.println(data);
		//System.out.println(arr.get(3));
	}
	}

}

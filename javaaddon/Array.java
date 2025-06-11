package Day5;
import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;
public class Array {

	public static void main(String[] args) {
		// int[] arr=new int[5];
		ArrayList <Integer> arr =new ArrayList();
		ArrayList<Object> arr2=new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.forEach(num-> System.out.println(num*num));
		
		arr.forEach(age->{
			if(age>=18) {
				System.out.println("allowed");
			}
			else {
				System.out.println("Not Allowed");
			}
		});
		arr2.add("hai java");
		System.out.println(arr);
		System.out.println(arr2);
	}

}

package Challenges;

public class Day2Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5};
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}

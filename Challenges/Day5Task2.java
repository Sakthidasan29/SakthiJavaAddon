package Day6;
import java.util.HashSet;
public class Day5Task2 {

	public static void main(String[] args) {
		HashSet<String>email=new HashSet();
		email.add(" Luffy@gmail.com");
		email.add("zoroo@gmail.com");
		email.add("Sanjicook@gmail.com");
		for (String data:email) {
			System.out.println(data);
		}

	}

}

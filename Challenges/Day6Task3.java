package Day6;

import java.util.HashMap;
import java.util.Map;
public class Day6Task3 {

	public static void main(String[] args) {
		HashMap<String,Integer> student=new HashMap();
	student.put("Sakthi",88);
	student.put("Surya",78);
	student.put("Sanjay",89);
	

	int totalmarks=0;
	for(int marks:student.values()) {
		totalmarks +=marks;
	}
		System.out.println("total Marks:"+totalmarks);
		double avg=totalmarks/student.size();
		System.out.println("average :"+avg);
		for(Map.Entry<String,Integer>entry :student.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	
	}
}

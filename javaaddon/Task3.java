package addonDay3;

public class Task3 {
	void fulltime(double salary) {
		System.out.println("Salary of full time employee:"+salary);
	}
	void parttime(double amount,int hours) {
		
		double psalary=amount*hours;
			System.out.println("Salary of parttime employee:"+psalary);	
	}
	void freelancer(double amount,int hours,double bonus) {
		double fsalary=amount*hours+bonus;
		System.out.println("Salary of Freelancer employee:"+fsalary);
	}
	public static void main(String[] args) {
		 Task3 in=new Task3();
		
		 in.fulltime(25000);
		 
		 in.parttime(100,50);
		 
		 in.freelancer(200, 50, 2000);
	}

}

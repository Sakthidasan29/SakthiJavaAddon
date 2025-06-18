package Day6;

public class Multi extends Thread {
	private String name;
	
	Multi(String name){
		this.name=name;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
class Execute{
	public static void main(String[] args) {
Multi m1=new Multi ("Thread 1");
		Multi m2=new Multi("Thread 2");
		m1.start();
		m2.start();
	

	}

}
}

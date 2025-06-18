package Day6;
//                                            THREAD
    
//                                            ONE METHOD

public class Methods extends Thread{
     public void run() {
	System.out.println("Haiiiii Thread");
	}
}
class Execute{

	public static void main(String[] args) {
		Methods m=new Methods();
		m.run();
		m.start();
	}

}
 


public class Methods extends Thread{
    public void run() {
    	for(int i=1;i<=10;i++)
    		System.out.println("hi thread...!"+" "+i);
//	System.out.println("Haiiiii Thread");
	}
}
class Execute{

	public static void main(String[] args) {
		Methods m=new Methods();
		m.run();
		m.start();
	}

}

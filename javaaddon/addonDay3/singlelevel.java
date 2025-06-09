package addonDay3;

public class singlelevel {
void message() {
	System.out.println("hiii");
	
}
}
class subclass extends singlelevel{
	void view() {
		System.out.println("welcome");
	}
}
class main{
	public static void main(String[] args) {
		subclass in=new subclass();
		in.message();
		in.view();
	}

}
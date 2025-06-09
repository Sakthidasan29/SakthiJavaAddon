package addonDay3;

public class Laptop {
		String name;
		int RAM;
		Laptop(String name,int RAM){
			this.name=name;
			this.RAM=RAM;
		}
		void Display() {
			System.out.println("Laptop Details:"+" "+name+" "+RAM+" ");
			
		}
	public static void main(String[] args) {
		Laptop in =new Laptop("ASUS",8);
in.Display();
	}

}

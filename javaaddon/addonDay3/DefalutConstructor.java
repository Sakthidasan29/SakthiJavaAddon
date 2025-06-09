package addonDay3;

public class DefalutConstructor {
	String language;
	String name;
	int year;
	DefalutConstructor(String name,int year,String lang){
		this.name=name;
		this.year=year;
		this.language=lang;
	}
	//copy constructor
	DefalutConstructor(DefalutConstructor copy){
		this.name=copy.name;
		this.year=copy.year;
		this.language=copy.language;
	}
	void display() {
		System.out.println("UserDefined Constructor"+" "+name+" "+year+ " "+language+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefalutConstructor ref=new DefalutConstructor("Java",1995,"programming ");
		ref.display();
		System.out.println("copy constructor");
		DefalutConstructor ref2=new DefalutConstructor(ref);
	ref2.display();
		
	}

}

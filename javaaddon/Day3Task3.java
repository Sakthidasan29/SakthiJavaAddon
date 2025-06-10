package javaaddon;

class SbiAcc{
	private String Accholder;
	private int Balance;
	
SbiAcc(String Accholder,int Balance) {
	this.Accholder=Accholder;
	this.Balance=Balance;
}
public String getAccholder() {
	return Accholder;
}
public int getBalance() {
	return Balance;
}
public void Deposit(int dep) {
	if(Balance > 0) {
		Balance += dep;
		System.out.println("Deposited Amount"+dep);
		System.out.println("Avilable Balance:"+Balance);
	}
}

public void setAccholder(String Accholder) {
this.Accholder=Accholder;	
}
public void setWithdraw(int Withdraw) {
	Balance -= Withdraw;
	System.out.println("Withdrawn Amount:"+Withdraw);
}
}

public class Day3Task3 {

	public static void main(String[] args) {
		SbiAcc ref=new SbiAcc("Luffy",20000);
		System.out.println(ref.getAccholder());
		ref.setAccholder("Zoro");
		System.out.println("updated Name:"+ref.getAccholder());
		System.out.println(ref.getBalance());
		ref.Deposit(50000);
		ref.setWithdraw(2000);
	//	System.out.println(ref.setWithdraw(0));
		System.out.println("avail balance:"+ref.getBalance());
		
	}

}

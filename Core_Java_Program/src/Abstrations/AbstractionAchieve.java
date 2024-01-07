package Abstrations;

abstract class Bank {
	abstract int  rateofinterest();
}
class PNB extends Bank{
	int rateofinterest(){
		return 9;
	}
}
class SBI extends Bank{
	int rateofinterest() {
		return 11;
	}
}
public class AbstractionAchieve {
	
	public static void main(String[] args) {
		Bank b;
		b=new PNB();
		System.out.println("Rate of Interest :"+b.rateofinterest()+"%");
		b=new SBI();
		System.out.println("Rate of Interest :"+b.rateofinterest()+"%");

	}

}

package AchieveInterface;
interface A{
	void Praveen();
	void Deepak();
	void Aman();
	void Ankush();
}
abstract class P implements A{
	public void Praveen() {
		System.out.println("It's a Praveen");
	}
	public void Deepak() {
		System.out.println("It's a Deepak");
	}
}
 class Z extends P{
	public void Aman() {
		System.out.println("It's a Aman");
	}
	public void Ankush() {
		System.out.println("It's a Ankush");
	}
}
public class Test1 {

	public static void main(String[] args) {
        A a;
        a=new Z();
        a.Praveen();
        a.Deepak();
        a.Aman();
        a.Ankush();

	}

}

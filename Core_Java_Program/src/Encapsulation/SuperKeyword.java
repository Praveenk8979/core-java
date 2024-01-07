package Encapsulation;
//use -1: "Super" keyword can be used to refer immediate parent class instance variable.
class Ab{
	int i=10;
}
public class SuperKeyword extends Ab {
	int i=20;
	void show(int i) {
		System.out.println(i);//30
		System.out.println(this.i);//20
		System.out.println(super.i);//10
	}

	public static void main(String[] args) {
        SuperKeyword s=new SuperKeyword();
        s.show(30);
	}

}

package Inheritence;
class B{
	void b() {
		System.out.println("B");
	}
}
class S extends B{
	void s() {
		System.out.println("S");
	}
}
class G extends S{
	void g() {
		System.out.println("G");
	}
}
class N extends G{
	void n() {
		System.out.println("N");
	}
}
public class Multilevel1 {

	public static void main(String[] args) {
		N n=new N();
		n.b();
		n.g();
		n.s();
		n.n();
		

	}

}

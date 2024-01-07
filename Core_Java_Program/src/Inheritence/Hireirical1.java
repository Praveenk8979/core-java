package Inheritence;
class Computer{
	void computer() {
		System.out.println("This is a Computer");
	}
}
class Key extends Computer{
	void key() {
		System.out.println("This is a Key");
	}
}
class CPU extends Computer{
	void cpu() {
		System.out.println("This is a CPU");
	}
}
public class Hireirical1 {

	public static void main(String[] args) {
		Key k=new Key();
		k.computer();
		k.key();
		CPU c=new CPU();
		c.computer();
		c.cpu();
	}

}

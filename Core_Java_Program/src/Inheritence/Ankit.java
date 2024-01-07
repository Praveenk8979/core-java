package Inheritence;
class Kamal{
	void run() {
		System.out.println("Kamal is running");
	}
}
public class Ankit extends Kamal {
	void eat() {
		System.out.println("Ankit is eating");
	}

	public static void main(String[] args) {
		Kamal k=new Kamal();
		k.run();
		

	}

}

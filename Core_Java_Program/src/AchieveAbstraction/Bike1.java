package AchieveAbstraction;
abstract class Vehicle{
	abstract int nooftyre();
}
class Car extends Vehicle{
	int nooftyre() {
		return 4;
		
	}
}
class Bike extends Vehicle{
	int nooftyre() {
		return 2;
	}
}
class Truck extends Vehicle{
	int nooftyre() {
		return 8;
	}
}
public class Bike1 {

	public static void main(String[] args) {
		Vehicle v;
		v=new Bike();
		System.out.println("No of Tyre :"+v.nooftyre());
		v=new Car();
		System.out.println("No of Tyre :"+v.nooftyre());
		v=new Truck();
		System.out.println("No of Tyre :"+v.nooftyre());

	}

}

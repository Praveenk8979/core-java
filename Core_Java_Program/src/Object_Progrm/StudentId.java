package Object_Progrm;

public class StudentId {
	String name;
	int id;
	//Perameterized method
	void insert(int a,String b) {
		id=a;
		name=b;
	}
	//non perameterized method
	void display() {
		System.out.println("Your name is "+name);
		System.out.println("Your id is "+id);
	}

	public static void main(String[] args) {
		StudentId s=new StudentId();
		s.insert(101, "Praveen");
		s.display();

	}

}

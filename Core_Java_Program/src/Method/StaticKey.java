package Method;

public class StaticKey {
	int eid;
	String empname;
	static String company="HCL ";
	StaticKey(int eid ,String empname){
		this.eid=eid;
		this.empname=empname;
		
	}
	void display() {
		System.out.println(eid+" "+empname+" "+company);
	}
			

	public static void main(String[] args) {
		StaticKey s=new StaticKey(101,"Praveen");
		s.display();
		StaticKey k=new StaticKey(102,"Abhi");
		k.display();

	}

}

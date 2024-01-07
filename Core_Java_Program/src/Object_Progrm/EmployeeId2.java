package Object_Progrm;

public class EmployeeId2 {
	int eid;
	String empname;
	void insert(int eid, String empname) {
		this.eid=eid;
		this.empname=empname;
	}
	void display() {
		System.out.println("Your Employee Id "+eid);
		System.out.println("Your Employee Name "+empname);
	}

	public static void main(String[] args) {
		EmployeeId2 e=new EmployeeId2();
		e.insert(101, "Praveen");
		e.display();

	}

}

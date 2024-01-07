package Encapsulation;


public class AchieveEncapsulation {
	private int id;
	private String name;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
public static void main(String[] args) {
	AchieveEncapsulation ae=new AchieveEncapsulation();
	ae.setId(10);
	int result=ae.getId();
	System.out.println(result);
	ae.setName("Praveen");
	String name=ae.getName();
	System.out.println(name);

	}

}

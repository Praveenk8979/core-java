package Encapsulation;

public class AcieveEnc {
	private String color;
	private int id;
	

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static void main(String[] args) {
		AcieveEnc s=new AcieveEnc();
		s.setColor("Black");
		String Result=s.getColor();
		System.out.println(Result);
		s.setId(101);
		int id=s.getId();
		System.out.println(id);
	}

}

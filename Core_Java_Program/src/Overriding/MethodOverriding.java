package Overriding;


class XYZ{
	void show (String a,int b) {
		System.out.println(1);
	}
}
public class MethodOverriding extends XYZ {
	void show(String a, int b) {
		System.out.println(2);
	}

	public static void main(String[] args) {
		XYZ x=new XYZ();
		x.show("Praveen", 7777);
		MethodOverriding m=new MethodOverriding();
		m.show("Thakur", 0007);

	}

}

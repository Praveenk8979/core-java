package Encapsulation;
//Use 1-this keyword can be used to the refer current class instance variable.
class Abc{
	int i;
	void setvalue(int i) {
		this.i=i;
		
	}
	void show() {
		System.out.println(i);
	}
}
public class ThisKeyword2 {

	public static void main(String[] args) {
           Abc c=new Abc();
           c.setvalue(10);
           c.show();
	}

}

package Collection;

import java.util.Vector;

public class Vectorr {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Praveen");
		v.add(1, "Deepak");
		v.addElement("Abhi");
		v.add(100);
		v.add(120.40);
		v.add('H');
		
//		System.out.println(v.firstElement());
//		System.out.println(v.lastElement());
		//System.out.println(v.remove("Abhi"));\
		//v.removeElementAt(3);
//		v.removeAllElements();
	//	System.out.println(v.capacity());
//		v.setElementAt("Rahul", 3);
		
		System.out.println(v);
	}

}

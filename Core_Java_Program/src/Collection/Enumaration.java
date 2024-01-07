package Collection;
import java.util.*;
public class Enumaration {
	public static void main(String[] args) {
	 Vector<String> v=new Vector<>();
	 v.add("100");
	 v.add("Praveen");
	 v.add("10.50");
	 
//	 System.out.println(v);
	 
	 Enumeration<String> e = v.elements();
     while (e.hasMoreElements()) {
         System.out.println(e.nextElement());
     }
}
}

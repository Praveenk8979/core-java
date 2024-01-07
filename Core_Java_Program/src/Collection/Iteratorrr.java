package Collection;
import java.util.*;
public class Iteratorrr {
		public static void main(String[] args) {
	List<String> l=new ArrayList<>();
	l.add("10");
	l.add("Praveen");
	l.add("Himanshi");
	l.add("Rahul");
	
	System.out.println(l);
	
	 Iterator<String> itr = l.iterator();
     while (itr.hasNext()) {
         System.out.println(itr.next());
     }
     l.remove("Himanshi");
     System.out.println(l);
}
}

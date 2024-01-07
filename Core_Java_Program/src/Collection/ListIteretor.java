package Collection;
import java.util.*;
public class ListIteretor {
	public static void main(String[] args) {
	
		List<String> li=new ArrayList<>();
		li.add("1001");
		li.add("Naman");
		li.add("Taran");
		li.add("Gautam");
		
		System.out.println(li);
		
		  ListIterator<String> litr = li.listIterator();
	        while (litr.hasNext()) {
	            System.out.println(litr.next());
	        }
	       System.out.println("____________________________");
	       
	       
	       while(litr.hasPrevious()) {
	    	   System.out.println(litr.previous());
	       }
	      
	        li.remove("Taran");
	        System.out.println(li);
	        
	        System.out.println("**********");
	        li.set(1, "200");
	        System.out.println(li);
}

	
}

package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTravarse {
	public static void main(String[] args) {
		
		
		List<String> lt=new ArrayList<String>();
		lt.add("Praveen");
		lt.add("Ankit");
		lt.add("Anuj");
		lt.add("Deepak");
		
		//using traverse of for loop
		for(int i=0; i<=lt.size()-1;i++) {
			System.out.println(lt.get(i));
		}
		System.out.println("+++++++++++");
		
		// for each loop
		for(String str: lt) {
			System.out.println(str);
		}
		System.out.println("++++++++++++");
		
		//iterator
		Iterator<String> it = lt.iterator();
		while(it.hasNext()) {
			String next = it.next();
			System.out.println(next);
		}
		System.out.println("++++++++++++++");
		//list iterator
		ListIterator<String> itr = lt.listIterator();
		while(itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
		System.out.println("___________++++++");
		
		//using list iterator backward direction
		ListIterator<String> itrr = lt.listIterator(lt.size());
		while(itrr.hasPrevious()) {
			String next = itrr.previous();
			System.out.println(next);
		}
		
		System.out.println("++++++++_________");
		//for each for lamda expression
		lt.forEach(e->System.out.println(e));
		
		
	}

}

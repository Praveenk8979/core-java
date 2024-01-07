package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSett {
	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Praveen");
		ar.add("Deepak");
		ar.add("Abhi");
		
		
		HashSet hs=new HashSet();
		hs.addAll(ar);
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		
		System.out.println(hs);
		
		
//		Iterator<Integer> itr= hs.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}

}

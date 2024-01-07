package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(101, "Praveen");
		m.put(102, "Deepak");
		m.put(103, "Abhi");
		m.put(102, "Ramesh");
		m.put(null, "Abhi");
		m.put(104, "Praveen");
		m.put(null, null);
		
	//	m.clear();
//		System.out.println(m.containsKey(107));
		//System.out.println(m.containsValue("Akash"));
		
//		System.out.println(m.get(102));
//		m.remove(102);
//		m.replace(102, "Akash");
//		System.out.println(m.size());
		
		System.out.println(m);
	}
}

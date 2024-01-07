package Collection;
import java.util.*;
import java.util.Map.Entry;
public class MapIterator {
	
	public static void main(String[] args) {
		
		Map<String, Integer> m=new HashMap<String, Integer>();
		
		m.put("Praveen", 107);
		m.put("Deepak", 100);
		m.put("Anuj", 101);
		m.put("Ankit", 104);
		
		Set<Map.Entry<String, Integer>> s=m.entrySet();
		Iterator<Map.Entry<String, Integer>> i=s.iterator();
		
		while(i.hasNext()) {
			Map.Entry<String, Integer> it=i.next();
			String st=it.getKey();
			int sc=it.getValue();
			System.out.println(st+ ":" +sc);
		}
		
	}

}

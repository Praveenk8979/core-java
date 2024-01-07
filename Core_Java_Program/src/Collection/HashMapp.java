package Collection;
import java.util.*;
public class HashMapp {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap();
		hm.put(101, "Praveen");
		hm.put(102, "Deeapk");
		hm.put(103,"Akash");
		hm.put(104, "Abhi");
		
		
//		hm.remove(103);
//		System.out.println(hm.containsKey(108));
//		System.out.println(hm.containsValue("Praveena"));
		
//		System.out.println(hm.isEmpty());
//		hm.replace(101, "KingShooter");
//		System.out.println(hm.size());
		
		
		System.out.println(hm);
		
//		for(Map.Entry me: hm.entrySet()) {
//			System.out.println(me.getKey()+" -> "+me.getValue());
//		}
		
//		Set set=hm.entrySet();
////		System.out.println(set);
//		Iterator itr=set.iterator();
//		while(itr.hasNext()) {
////			System.out.println(itr.next());
//			Map.Entry en=(Map.Entry) itr.next();
//			System.out.println(en.getKey()+" -> "+en.getValue());
//		}
	}

}

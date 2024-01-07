package Collection;

import java.util.TreeSet;

public class TreeSett {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
//		ts.add(60);
//		ts.add(20);
//		ts.add(50);
//		ts.add(10);
//		ts.add(40);
//		ts.add(30);
		
		ts.add("Praveen");
		ts.add("Abhi");
		ts.add("Rakesh");
		ts.add("Khushi");
		ts.add("Manjari");
		
//		ts.clear();

		ts.remove("Rakesh");
		System.out.println(ts);
	}

}

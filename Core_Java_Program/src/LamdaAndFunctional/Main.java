package LamdaAndFunctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


interface DoubleColon{
	void show();
}

class ABC{
	public  void display() {
		System.out.println("Hii Praveen");
	}
}

public class Main {
	
	
	
	public static void main(String[] args) {
		ABC ob=new ABC();
		DoubleColon dc= ob :: display;
		dc.show();
		
//		List<Employee> lt=new ArrayList<Employee>();
//		lt.addAll(Arrays.asList(new Employee(101,"Praveen"),
//				new Employee(102,"Deepak"),
//				new Employee(103,"Abhi"),
//				new Employee(104,"Gautam")
//				));
//		System.out.println(lt);
//		
//		Comparator<Employee> com=new Comparator<Employee>() {
//			
//		Collections.sort(lt,new Comparator<Employee>() {
//		
//			@Override
//			public int compare(Employee e1, Employee e2) {
//				return e1.getName().compareTo(e2.getName());
//			}
//			
//		});
//		Collections.sort(lt,
//				(Employee e1,Employee e2)->e1.getName().compareTo(e2.getName())
//				);
//		
		//Class_name :: Method_name
		
//		Collections.sort(lt,Comparator.comparing(Employee :: getName));
//		Collections.sort(lt,com);
	//	System.out.println(lt);
	}

}

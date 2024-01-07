package LamdaAndFunctional;

interface Operation{
	public int opt(int x,int y);
}

public class Test {
	
	public static void result(int x, int y, Operation obj) {
		System.out.println(obj.opt(x ,y));
	}
	
	public static void main(String[] args) {
		//result(5,8, (a,b) -> (a*b));
		
		
		//Indirectly 
		
		Operation ob=  (a,b) -> (a*b);
		System.out.println(ob.opt(5, 9));
	}

}

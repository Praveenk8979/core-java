package Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		System.out.println("Statement 3");
		System.out.println("Statement 4");
		try {
		int data =100/0;
		System.out.println(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I'm finally block");
		}
		System.out.println("Statement 5");
		System.out.println("Statement 6");
		System.out.println("Statement 7");
		System.out.println("Statement 8");
		System.out.println("Statement 9");
		System.out.println("Statement 10");


	}

}

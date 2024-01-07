package Exception;

public class TryAndCatch {

	public static void main(String[] args) {
		try {
			int a=100,b=5,c;
				c=a/b;
				System.out.println(c);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("I'm finally block");
		}

	}

}

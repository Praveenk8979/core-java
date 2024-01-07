package Recursion;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		
		int f=fibonacci(num);
		System.out.println("Fabonacci number "+num+ " is:" +f);
	}

	private static int fibonacci(int num) {
		if(num==0) {
			return 0;
		}else if(num==1) {
			return 1;
		}else {
			return fibonacci(num-1)+fibonacci(num-2);
		}
		
	}

}

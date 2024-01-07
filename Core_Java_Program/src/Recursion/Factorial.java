package Recursion;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		
		int r=fact(num);
		System.out.println("Factorial number "+num+ " is :" +r);
		
	}

	private static int fact(int num) {
		if(num==0 || num==1) {
			return 1;
		}else {
			return num*fact(num-1);
		}
		
	}
	
}

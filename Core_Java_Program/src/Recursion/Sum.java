package Recursion;

import java.util.*;
public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int s=sum(num);
		System.out.println("Sum of number "+num+ " is :" +s);
	}

	private static int sum(int num) {
		if(num==1) {
			return 1;
		}else {
			return num+sum(num-1);
		}
		
	}
}

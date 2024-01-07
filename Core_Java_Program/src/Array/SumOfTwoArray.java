package Array;
import java.util.*;
public class SumOfTwoArray {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size of array :");
//		int size =sc.nextInt();
//		
//		int[] num=new int[size];
//		
//		System.out.println("Enter the element of array :");
//		for(int i=0;i<size;i++) {
//			System.out.println("Element " +(i+1)+" : ");
//			num[i] =sc.nextInt();
//		}
		
		int[] num= {4,5,6,7,8};
		
		int sum=0;
		for(int nums:num) {
			sum +=nums;
			
		}
		System.out.println("Sum of ann array :"+sum);
		
	}
}

package Array;
import java.util.*;
public class MaxAndMinArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int[] num=new int[size];
		System.out.println("Enter the element :");
		for(int i=0;i<size;i++) {
			System.out.println("Element of " +(i+1)+ " : ");
			num[i]=sc.nextInt();
		}
		
		int max=num[0];
		int min=num[0];
		for(int nums:num) {
			if(nums>max) {
				max=nums;
			}
			if(nums<min) {
				min=nums;
			}
		}
		System.out.println("Maximum is :"+max);
		System.out.println("Minimum is :"+min);
	}
}

package Array;
import java.util.*;
public class AverageOfArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array :");
	int size=sc.nextInt();
	
	int[] num=new int[size];
	System.out.println("Enter the element of array :");
	for(int i=0;i<size;i++) {
		System.out.println("Element :"+(i+1)+" : ");
		num[i]=sc.nextInt();
	}
	
	int sum=0;
	for(int nums:num) {
		sum+=nums;
		
	}
	double av=(double)sum/num.length;
	System.out.println("Average of array :"+av);
	
	
}
}

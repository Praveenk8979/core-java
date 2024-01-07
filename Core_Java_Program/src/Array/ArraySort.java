package Array;
import java.util.*;
public class ArraySort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size =sc.nextInt();
		
		int[] num=new int[size];
		System.out.println("Enter the element of array :");
		for(int i=0;i<size;i++) {
			System.out.println("Element of "+(i+1)+" : ");
			num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		System.out.println("Sorted array :"+Arrays.toString(num));
	}
}

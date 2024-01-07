package Array;
import java.util.*;
public class SearchElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int[] num=new int[size];
		System.out.println("Enter the element :");
		for(int i=0;i<size;i++) {
			System.out.println("Element of :" +(i+1)+" : ");
			num[i]=sc.nextInt();
		}
		System.out.println("Enter the search for element :");
		int sr=sc.nextInt();
		
		boolean found=false;
		for(int nums:num) {
			if(nums==sr) {
				found =true;
				break;
			}
		}
		if(found) {
			System.out.println("Element found in the array :");
		}else {
			System.out.println("Element not found in the array :");
		}
	}
}

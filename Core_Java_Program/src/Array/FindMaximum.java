package Array;

import java.util.*;

public class FindMaximum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		int maximum = findMax(array);
		System.out.println("Maximum Element: " + maximum);

		scanner.close();
	}

	private static int findMax(int[] arr) {

		return 0;
	}

}

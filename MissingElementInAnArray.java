package week3.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5,7, 6, 8 ,10};

		// sort array in ascending order
		Arrays.sort(arr);

		// find difference between the elements in the given series
		int diff = arr[1] - arr[0];

		System.out.println("print missing elements:");
		for (int i = arr[0]; i < arr.length - 1; i++)

		{
			if (diff != arr[i + 1] - arr[i]) {
				System.out.println(arr[i] + diff);
			}
		}
	}

}

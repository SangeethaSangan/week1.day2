package week1.day2assign;

import java.util.Arrays;

public class MissisngEleminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 5, 7 };
		Arrays.sort(a);

		for (int i = a[0]; i < a.length; i++) {

			for (int j = a[0]; j < a[a.length - 1]; j++)// 1 to 5
			{
				if (j != a[i - 1]) {
					System.out.println(j);
					continue;
				}

			}
		}

	}

}

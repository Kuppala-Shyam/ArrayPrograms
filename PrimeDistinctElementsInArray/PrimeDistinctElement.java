package InternPack;

import java.util.Arrays;

public class PrimeDistinctElement {

	public static void main(String[] args) {
		int[] a = { 4, 3, 5, 3, 7, 5, 11, 7 };

		int count = 0;
		boolean[] seen = new boolean[a.length]; 

		for (int i = 0; i < a.length; i++) {
			if (seen[i]) {
				continue; 
			}

			if (isPrime(a[i])) {
				count++;
				for (int j = i + 1; j < a.length; j++) { 
					if (a[j] == a[i]) {
						seen[j] = true; 
					}
				}
			}
		}

		int[] b = new int[count]; 
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			if (!seen[i] && isPrime(a[i])) {
				b[index++] = a[i];
			}
		}

		System.out.println(Arrays.toString(b)); 
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

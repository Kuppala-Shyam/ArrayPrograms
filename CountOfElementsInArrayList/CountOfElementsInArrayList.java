package InternPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountOfElementsInArrayList {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter the desired number of elements you want :");
		int desiredNumberOfElements=scan.nextInt();
		int count=0;
		for(int i=0;i<desiredNumberOfElements;i++) {
			System.out.println("Enter the elements"+i);
			al.add(scan.nextInt());
		}
		System.out.print("[");
		for (int a : al) {
			count++;
			System.out.print(a+" ");
		}
		System.out.println("]");
		System.out.println("count number of elements :"+count);
	}

}

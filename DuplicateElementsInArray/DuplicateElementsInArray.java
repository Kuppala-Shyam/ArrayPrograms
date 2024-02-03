package InternPack;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElementsInArray {
static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of array:");
		int size=scan.nextInt();
		int[] a= new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elements:"+(i));
			a[i]=scan.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]&&i>j) {
					break;
				}
				if(a[i]==a[j]) {
					count++;
//					System.out.print(a[i]+"");
					break;
				}
			}
		}
//		System.out.println();
//		System.out.print(count);
		int[] b= new int[count];
		int index=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]&&i>j) {
					break;
				}
				if(a[i]==a[j]) {
//					System.out.println(a[i]);
					b[index++]=a[i];
					break;
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}

}

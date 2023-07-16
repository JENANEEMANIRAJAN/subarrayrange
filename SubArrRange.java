package subArrRange;

import java.util.Arrays;
import java.util.Scanner;

public class SubArrRange {
	public static int[] range(int arr[], int a, int b) {
		int p[] = new int[a-b+1];
		int f=0;
		for(int i=b; i<=a; i++) {
			p[f] = arr[i];
					}
		return p;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		int value[] = range(arr, a, b);
				System.out.println(Arrays.toString(value));
				}

}

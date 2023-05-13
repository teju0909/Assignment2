// Java program to check if an array is a subset of another array

import java.util.*;

class SubSet {
	static boolean subset(int arr1[], int arr2[], int m, int n) {
		int i = 0;
		int j = 0;
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (arr2[i] == arr1[j])
					break;
			}

			if (j == n)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		int m, n, i;
		int arr1[] = new int[10];
		int arr2[] = new int[10];
		boolean flag = true;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array 1 : ");
		m = sc.nextInt();
		System.out.print("Enter the size of array 2 : ");
		n = sc.nextInt();
		System.out.print("Input the array 1 elements : ");
		for (i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.print("Input the array 2 elements :");
		for (i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}

		if (subset(arr1, arr2, n, m))
			System.out.print("\nArray 2 is a subset of array 1\n");
		else
			System.out.print("\nArray 2 is not a subset of array 1\n");
		System.out.println("Do You Want To Run Again? [Yes(y/Y)/No] ::");
		Scanner sc2 = new Scanner(System.in);
		String ans=sc2.next();
		if("Yes".equals(ans)||"YES".equals(ans)||"yes".equals(ans)||"Y".equals(ans)||"y".equals(ans)) {
			flag=true;
		}else {
			flag=false;
			System.out.println("Application Has Stopped..");
		}
		
		}while(flag);
		
	}
}

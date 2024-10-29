package Demo;

import java.util.Arrays;
import java.util.Scanner;

class BinSearch {
	int[] arr;

	BinSearch(int[] arr) {
		this.arr = arr;
	}

	int search(int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				return mid + 1;
			} else {
				return mid - 1;
			}

		}
		return -1;
	}

}

public class BinarySearch {

	public static void main(String[] args) {
		// int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array:");
		int n = sc.nextInt();

		int[] sortedArray = new int[n]; // create a array given input from user

		System.out.println("Enter the elements of the arrays:");
		for (int i = 0; i < n; i++) {
			sortedArray[i] = sc.nextInt();
		}

		Arrays.sort(sortedArray); // sort the array

		System.out.println("Sorted Array:" + Arrays.toString(sortedArray));

		BinSearch obj = new BinSearch(sortedArray);

		System.out.println("Enter the search element:");
		int target = sc.nextInt();

		// int target = 7;

		int result = obj.search(target);

		if (result != -1) {
			System.out.println("Number is Found at index:" + result);
		} else {
			System.out.println("Number is not found in the array!");
		}

	}

}

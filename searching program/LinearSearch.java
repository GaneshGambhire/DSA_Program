package Demo;

import java.util.Arrays;
import java.util.Scanner;

class Linear {
    int[] arr;

    Linear(int[] arr) {
        this.arr = arr;
    }

   
    int search(int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; //  target is found
            }
        }
        return -1; // target is not found
    }
}

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Create an array based on user input

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

      
        Linear obj = new Linear(arr);

      
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("Enter the element to search:");
        int target = sc.nextInt();

       
        int result = obj.search(target);

        if (result != -1) {
            System.out.println("Number found at index: " + result);
        } else {
            System.out.println("Number not found in the array!");
        }

       
    }
}

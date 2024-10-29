package Demo;

import java.util.Scanner;

class Bubble {
    int[] a;

   
    Bubble(int[] a) {
        this.a = a;
    }

    
    void sort() {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap the elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

 
    void printArray() {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

      
        Bubble obj = new Bubble(a);

        System.out.println("Array before sorting:");
        obj.printArray();

      
        obj.sort();

        System.out.println("Array after sorting:");
        obj.printArray();

       
    }
}

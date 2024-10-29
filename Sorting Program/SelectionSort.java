package Demo;

import java.util.Scanner;

class Selection {
    int[] selectionArray;

   
    Selection(int[] selectionArray) {
        this.selectionArray = selectionArray;
    }

    // Method  selection sort
    void selsort() {
        int n = selectionArray.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
               
                if (selectionArray[j] < selectionArray[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap 
            int temp = selectionArray[minIndex];
            selectionArray[minIndex] = selectionArray[i];
            selectionArray[i] = temp;
        }
    }

   
    void printArray() {
        for (int i : selectionArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();

        int[] selectionArray = new int[n];

        System.out.println("Enter the elements in the Array:");
        for (int i = 0; i < n; i++) {
            selectionArray[i] = sc.nextInt();
        }

      
        Selection obj = new Selection(selectionArray);

        System.out.println("Array Before the sorting:");
        obj.printArray();

       
        obj.selsort();
        System.out.println("Array After the sorting:");
        obj.printArray();

        sc.close(); 
    }
}

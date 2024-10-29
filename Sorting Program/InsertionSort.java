package Demo;

import java.util.Scanner;

class Insertion{
	int[] array;
	
	Insertion(int[] array){
		this.array = array;
	}
	
	void insertSort() {
		
		for(int i = 0;i<array.length;i++) {
          int current=array[i];
          int j= i-1;
          while(j >= 0 && array[j] > current ) {
        	  array[j+1] = array[j];
        	  j--;
        	  
          }
          array[j+1] = current;
		}
	}
	void printArray() {
		for( int i: array) {
		  System.out.print(i+" ");
		}
		System.out.println();
	}
}



public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int[] insertArray = new int[n];
		
		System.out.println("Enter the element in Array:");
		for (int i = 0; i < n; i++) {
             insertArray[i] = sc.nextInt();		
		}
		
       Insertion obj = new Insertion(insertArray);
       System.out.println("Array before the sorting:");
       obj.printArray();
       
       
       obj.insertSort();
       System.out.println("Array after the Sorting:");
       obj.printArray();
       
       sc.close();
       
	}

}

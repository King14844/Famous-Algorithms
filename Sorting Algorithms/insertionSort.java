package sortingalg;

import java.util.Scanner;

public class insertionSort {

   /*  public static void insertionSorting(int[] arr){

        for(int i = 1; i < arr.length ; i++){

           int val = arr[i];
           
           int j = i - 1;

           while (j>=0 && arr[j] > val){
             
            arr[j+1] = arr[j];
            j--;
           }

           arr[j+1] = val ;
           
        }

    }*/

    public static void insertionSorting(int[] arr){

        for(int i=1; i<arr.length ; i++){

            int j = i;

            while( j>0 && arr[j] < arr[j-1]){

                int temp = arr[j] ;
                arr[j]   = arr[j-1];
                arr[j-1] = temp ;

                j--;
            }

        }
    }

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        
        int arr[] = new int[n] ;

        System.out.println("Enter the elements of array");

        for(int i = 0; i<n ;i++ ){

            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Array before sorting");
        
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        insertionSorting(arr);
         
        System.out.println("\n");
        
        System.out.println("Array after sorting");
        
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

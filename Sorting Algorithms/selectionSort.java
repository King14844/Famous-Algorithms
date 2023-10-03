package sortingalg;

import java.util.Scanner;

public class selectionSort {

    public static void selectionSorting(int []arr){
           
        int min , temp;

        for(int i = 0; i < arr.length ; i++){
              
            min=i;

            for(int j = i+1 ; j < arr.length ; j++){

                if( arr[min] > arr[j] ){

                    min = j ;
                }
            }

            temp = arr[min] ;
            arr[min] = arr[i] ;
            arr[i] = temp ;

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

        selectionSorting(arr);
         
        System.out.println("\n");
        
        System.out.println("Array after sorting");
        
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

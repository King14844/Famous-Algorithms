
import java.util.Scanner;

public class BubbleSort {

     static void bubbleSorting(int arr[]){

        for(int i=0; i<arr.length ; i++){
            
            for(int j=0; j<arr.length - i - 1 ; j++){
                     
                if(arr[j] > arr[j+1]){

                    int temp = arr[j] ;
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp ;
                }
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

        bubbleSorting(arr);
         
        System.out.println("\n");
        
        System.out.println("Array after sorting");
        
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

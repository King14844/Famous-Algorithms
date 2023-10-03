package DivideAndConquer;

public class QuickSorting {

    public static int partition( int[] arr, int l, int h){

        int i=l;
        int pivot = arr[l];

        for(int j=l+1; j<=h; j++){

            if( arr[j]<=pivot){

                i=i+1;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }

        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;

        return i;

    }

    public static void quickSort(int[] arr, int l, int h ){

        if( l < h){

        int m = partition(arr,l,h);

        quickSort(arr, l, m-1);
        quickSort(arr, m+1, h);

        }

        return ;

    }

    public static void main(String[] args) {

        int[] arr ={6,4,3,7,1,7,1};

        System.out.println("Array is before sorting");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }

         System.out.println("\nArray is after sorting");

         quickSort(arr, 0, arr.length-1);

          for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }


        
    }
    
}

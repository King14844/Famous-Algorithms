
public class Maximumsubarray {
	public static int Midpoint_Crosssum(int arr[], int low, int mid, int high) 
    { 
		int sum = 0; 
		int leftsum = Integer.MIN_VALUE; 
		for (int i = mid; i >= low; i--) 
		{ 
			sum = sum + arr[i]; 
			if (sum > leftsum) 
			   leftsum = sum; 
		} 
		sum = 0; 
		int rightsum = Integer.MIN_VALUE; 
		for (int i = mid + 1; i <= high; i++) 
		{ 
		  sum = sum + arr[i]; 
		  if (sum > rightsum) 
		    rightsum = sum; 
		} 
	 return leftsum + rightsum; 
    } 
  public static int Left_Right_MaximumSubarray(int arr[], int low, int high) 
       {  
			if (low == high) 
			    return arr[low];  
			else 
			{int mid = (low + high)/2; 
			return Math.max(Math.max(Left_Right_MaximumSubarray(arr, low, mid), Left_Right_MaximumSubarray(arr, mid+1, high)), Midpoint_Crosssum(arr, low, mid, high)); 
			}
		} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 4, -6, -2, 3,8};  
	    int maxsum = Left_Right_MaximumSubarray(arr, 0, arr.length-1); 	      
	    System.out.println("Maximum subarray sum is "+ maxsum); 
	}

}

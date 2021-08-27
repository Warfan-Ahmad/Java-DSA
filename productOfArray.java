/* Here we find the product of the arrays using the recurssion */

public class productOfArray {

    public static int pOfArray(int arr[],int n)
    {
        if(n<0) // Unexpected input
        {
            return 0; 
        }
        if(n==1) // Base CONDITION
        {
            return (arr[n-1]); // Returning the element back
        } 
        return pOfArray(arr, n-1) * arr[n-1]; // Last element gets multiplied with the rest array.
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        System.out.print(pOfArray(arr,n));
    }
    
}

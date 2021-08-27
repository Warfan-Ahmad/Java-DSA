/**
 * In this program we take two elements of the array and then try to sum and evaluate to our key value.
 */

public class recursion {
    public static void main(String[] args) {
// Now with some modification where we evalute any two pairs
        int arr[] = {1,2,3,0,5,6,-1};
        int key = 5;
        
        for(int i=0;i<arr.length-1;i++)
        {
            
            for(int j=i+1 ;j<arr.length;j++)
            {
                if(arr[j] + arr[i] == key)
                {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }

        }

        }
    }
    /**
     * int arr[] = {1,2,3,0,5,6,7};
        int key = 5;
        
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j+1] + arr[j] == key)
                {
                    System.out.println(arr[j+1] + " " + arr[j]);
                }
            }

     */

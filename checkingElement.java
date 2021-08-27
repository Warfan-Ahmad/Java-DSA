/**
 * This is a very basic problem where you need to find the number in the given array
 */
public class checkingElement {

    public static void main(String[] args) {
        int numFind= 4;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == numFind)
            {
                System.out.print("Number found");
            }
        }
    }
    
}

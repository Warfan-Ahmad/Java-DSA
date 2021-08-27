/**
 * In this coding challenge we have to sum up two digits and there sum should be equal to the given number
 */

public class sumOfPairs {

    public static void main(String[] args) {
        int num = 10;//Given Number
        int arr[] = {1,3,4,6,8,2}; //array
        for(int i=0;i<arr.length-1;i++) //Starting from 0 index element to last minus 1 as we dont have to compare that with anyone
        {
            if(arr[i+1] + arr[i] == num) // adding the elements first then checking for condition
            {
                System.out.println("Pair is (" + arr[i] + " " + arr[i+1] + ")");
            }
            
        }
    }
    
}

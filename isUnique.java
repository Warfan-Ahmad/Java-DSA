/**
 * In this program we need to find if the elements are unique in the array
 */
public class isUnique {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,8,7};
        int count=0;


        for(int i=0;i<arr.length-1;i++)//outer loop selecting the element to be compared
        {
            for(int j=i+1;j<arr.length;j++) //Comparison done here with rest of thee elements
            {
                if(arr[i]==arr[j]) // checking if found
                {
                    count++; //count incresed 
                }
            }
        }
        if(count>0) // if greater than 0 then its false as it enterd the if condition above
        {
            System.out.print(false);
        }
        else
        {
            System.out.print(true);
        }
    }
    
}

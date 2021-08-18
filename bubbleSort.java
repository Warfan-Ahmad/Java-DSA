
/**
Bubble sort is a basic sort where we take an element compare it with next
to see which is bigger the bigger it is we assign it to higher indexes
 */
public class bubbleSort {
public static void main(String[] args) {
    
    int arr[] = {8,7,9,6,4};
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        
        //Started from i+1 because we dont want to compare it with itself
        {
            //Checks condition is they are greater  or not

            if(arr[i]>arr[j])
            {
                //Basic logic of swapping
                int temp=0;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }
        System.out.print(arr[i]);
    }
}
}
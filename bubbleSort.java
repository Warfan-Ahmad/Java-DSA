
/**
Bubble sort is a basic sort where we take an element compare it with next
to see which is bigger the bigger it is we assign it to higher indexes
 */

import java.util.Arrays;


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
        System.out.print(arr[i] + " ");
    }
}
}

//Method Two
/*
public static void main(String[] args) {

    int arr[] = {8,7,9,6,4};
    int temp=0;

        
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            
           
            //Started from i+1 because we dont want to compare it with itself
            {
                //Checks condition is they are greater  or not
    
                if(arr[j]>arr[j+1])
                {
                    //Basic logic of swapping
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
                
                
            }
          
        }
        System.out.print(Arrays.toString(arr));
    
    }
    */

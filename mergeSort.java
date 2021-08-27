public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {5,6,7,3,2,6};
        int high = arr.length-1; //Assigning high as length - 1 cox there in array there are always n-1 elements
        int low = 0;// low will start from 0 as array starts with 0

        mergeSort ob = new mergeSort(); // Creating an object of the merge class 
        ob.mergeSort1(arr,low,high); //Calling the sort function with array low and high as arguments



        //Printing the final array after sorted

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }        
    }

//This function does the spliting of the array 

    void mergeSort1(int arr[],int low, int high) 
    {
        int mid;
        if(low < high) // Checking if the elements in the array are more than two or not
        {
            mid = (high + low)/2; // Creating a mid point 
            mergeSort1(arr, low, mid); // Performing recursive operations to split the array
            mergeSort1(arr, mid+1, high); // Spliting the other half of the array after the mid point
            merge(arr, low, mid, high); // Now merging all the sub array together
        }
       
    }

// This binds back the array

     void merge(int arr[], int low, int mid, int high) 
     {//here is the problem  when splitting the array into two i dont take them up individually
            int i = low; // Assigning low to i we will use i as the low point
            int k = low; // New array will start from the 0 so that is why low
            int j = mid+1; // j will be treated as the mid point
            int arry[] = new int[arr.length]; // New array where we will store the sorted array

        while(i<= mid && j <= high) // Checking condition if i is less than mid and j is less than the high
        {
            if(arr[i]<arr[j]) // if the arr[i] is less than the j 
            {
                arry[k] = arr[i]; // we assign the element in the new array
                i++;// increment
                k++; //increment
            }
            else
            {
                arry[k] = arr[j]; // if the case in inverse we put j element in new array
                j++;
                k++;
            }
        }

        //Now here is the case if one of them has reached to the end

        if(i>mid) // if the i is greater than the mid that means it has reached to its end
        {
            while(j<high) // So till j is  less than high we assign its element in the new array
            {
                arry[k] = arr[j]; // Assignment of the element in new array
                k++;
            }
        }
        else
        {
            while(i<mid) // if the condtion is inverse j has reached its end then i will run till the mid
            {
                arry[k] = arr[i]; // assignment
                k++;
            }
        }

        // Now we have made a new array of the sorted elements 
        for(int a=low;a<=high;a++) 
        {
            arr[i] = arry[a]; // Copying the sorted array elements to the original array
        }
    }
}

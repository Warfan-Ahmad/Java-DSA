public class insertionSort{

    // Here we do the insertion sort

    public static void main(String[] args) {
        int arr[] = {5,4,7,8,9,2};
        int temp,j;
        //creating a temp variable to hold temporary values

        for(int i=1;i<arr.length;i++)
        {
            temp = arr[i];// assigning the value of i in temp
            j = i-1; //starting from i-1 as we are traversing backwards in the loop to check the values

            while(j>=0 && arr[j]>temp) //Two conditions are checked one is j less than 0 i.e. array is finished and second the varaible at j is greater than temp then we do the insertion
            {
                arr[j+1] = arr[j]; //Inserting the element of j in J+1 where the temp was actually
                j--; //decremeting the loop
            }
            arr[j+1]=temp; // now assinginng the value in the empty space
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+ " ");
        }
        
    }
}
public class selectionSort{
    public static void main(String[] args) {
        
        int minindex=0,temp;

        int arr[] = {5,4,3,2,1};

        for(int i=0;i<arr.length-1;i++)

        // Here we run the loop from first element to second last element
        //as we dont want to compare the last element with anyone so it becomes unessary
        {
            minindex = i; //Assingnig the value of i to minindex which helps to locate the element
            for(int j=i+1;j<arr.length;j++) // this loop is started from i+1 as we dont want to compare the first elemnet with itself
            {
                if(arr[minindex]>arr[j]) //Comparing the first element with the next element
                {
                    minindex = j;
                }
            }
            //simple swapping logic
            temp = arr[minindex];
            arr[minindex]  = arr[i];
            arr[i] = temp;
        }
        for(int k=0;k<arr.length;k++)
    {
        System.out.print(arr[k]+ " ");

    }    
}
}


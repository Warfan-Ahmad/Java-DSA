public class maxMin {
    public static void main(String[] args) {
        int max=0,min=0;
        int arr[] = {1,2,3,4,5};

        for(int i=0;i<arr.length;i++)
        {
            max = arr[0];
            min=arr[0];
            if(max<=arr[i])
            {
                min = arr[i];
            }
            else
            {
                max = arr[i];
            }
        }
        System.out.print(max + " "+ min);
    }
    
}

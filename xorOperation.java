import java.lang.reflect.Array;
import java.util.*;

public class xorOperation {
    public static void main(String[] args) {
        int arr[] = {10, 11, 1, 2, 3};

        for(int i=0;i<arr.length-1;i++)
        {
            arr[i] = arr[i]^arr[i+1];
        }

        System.out.print(Arrays.toString(arr));

    }
    
}

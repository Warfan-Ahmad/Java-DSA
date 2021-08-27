import java.net.SocketPermission;

import javax.swing.plaf.basic.BasicTreeUI.FocusHandler;

public class largestNumber {

    public static void main(String[] args) {
        int arr[] = {1,2,3,6,5};
        int largest=0;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<=arr[i+1])
            {
                largest =  arr[i+1];
            }
        }
        System.out.println(largest);
    }
    
}

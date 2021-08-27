/**
 * This is a interview question asked how we can find a missing no in an array
 */

public class missingNoinArray {
        public static void main(String[] args) {
            int sum=0,n,original_sum,mising_no;
            int[] ar= {1,2,3,4,5,6,7,9,10};
            n = ar.length;
            original_sum = 10 * (10+1)/2;  //Here i am calculating the sum at first so that it can be used later

            for(int i=0;i<n;i++)
            {
                sum += ar[i];//Summing up the elements of the array
            }
            if(original_sum > sum) //checking first then performing calculation
            {
                mising_no = original_sum - sum; //Missing no
                System.out.print(mising_no);
            }
            else
            {
                System.out.println("No Missing Number");
            }

            
        }
}

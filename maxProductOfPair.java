/**
 * here in this question we are supposed to calculate the product of the pair and then we have to 
 * check which pair is the maximum product
 */
public class maxProductOfPair {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,2};
        int currentProduct=0,maxProduct=0;


        for(int i=0;i<arr.length-1;i++)
        {
            
            currentProduct = arr[i] * arr[i+1]; //Product of the pair and storing in the current product

            if(currentProduct>maxProduct) // Comparing the variables
            {
                maxProduct = currentProduct; //Assigning the value if found true
            }
        }
        
        
        System.out.print(maxProduct);
    }
    
}

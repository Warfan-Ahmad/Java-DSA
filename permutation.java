/**
 * This program find the two arrays are permutation of each other i.e., same elements in both array without the correct order 
 I could have approached this problem with one more approach that is if the sum and product of the elements in the array 1 is eqaul to the array 2 we have same arrays
 */

 //This is brute force method with O(n^2) while the below has O(N);
public class permutation {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {5,3,4,21,1};
        int count=0;


        for(int i=0;i<arr1.length;i++)//Taking the array 1 elements one by one 
        {
            for(int j=0;j<arr2.length;j++) // comparing with all other elements of array 2
            {
                if(arr1[i] == arr2[j]) // if found 
                {
                    count++; // cont increment
                }
            }
        }

        // here what i am doing is that i am assuming if all the elements are in the array 2 then the count will be equal to the length of the array so thats why i wrote it here... its not the most effective way to write it.

        if(count==arr1.length)
        {
            System.out.print("Array 1 is permutation of Array 2");
        }
        else
        {
            System.out.print("No the Arrays are not permutations");
        }
    }
}


/**
 * class Main {
  public static void main(String[] args) {
    Main mn = new Main();
    int[] array1 = {1,2,3,4,5};
    int[] array2 = {5,4,3,2,1,0};
    boolean result = mn.permutation(array1, array2);
    System.out.println(result);

  }

  // Permutation
  public boolean permutation(int[] array1, int[] array2){
    if (array1.length != array2.length ) {
      return false;
    }
    int sum1 = 0;
    int sum2 = 0;
    int mul1 = 1;
    int mul2 = 1;

    for (int i = 0; i<array1.length; i++) {
      sum1 += array1[i];
      sum2 += array2[i];
      mul1 *= array1[i];
      mul2 *= array2[i];
    }
    if (sum1 == sum2 && mul1 == mul2) {
      return true;
    }
    return false;
  }

}

 */
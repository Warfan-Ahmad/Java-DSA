public class sumOfDigits {

    public static int Sum(int n)
    {
        if(n==0 || n<0) // Base CONDITION
        {
            return (0); // Returning the 0 back
        } 
        return  n%10 + Sum(n/10); // Last element gets added with the other digit.
    }

    public static void main(String[] args) {
        int n = 112;
        System.out.print(Sum(n));
    }
    
}

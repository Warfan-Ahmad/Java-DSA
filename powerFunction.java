/*Here we measure the power of a number using recurssion */

public class powerFunction {

    public static int power(int number, int pow)
    {
        if(number < 0)
        {
            return 0;
        }
  
        if(pow !=0) //base condition
        {
            return (number * power(number, pow-1)); //Recursive Calls
        }
        
        return 1;
    }
    public static void main(String[] args) {

        int number = 3;
        int pow = 4;

        System.out.print(power(number, pow));
        
    }
    
}

public class factorialRecurssion{
    public static void main(String[] args) {
        int n = 5;
        int res = recursion(n);//calling the function and passing parameter
        System.out.println(res);;
    }
    public static int recursion(int n) { //called function
        if(n==0) //if n is 0 then its value will be 1
        {
            return 1;
        }
        else
        {
            return n * recursion(n-1); //here what is n is multiplied by it n-1 i.e. if 5 --> 5 * (5-1) untill n is 0
        }
        
    }
}
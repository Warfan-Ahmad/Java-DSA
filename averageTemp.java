/**
 * This is the simple program which takes the input from user and try to calculate the average temprature
 * and then return back also calculates the no of days where tempreture was above average.
 */

import java.util.Scanner;

public class averageTemp{
    public static void main(String[] args) {
        // Initilization part

        Scanner sc = new Scanner(System.in);
        int no_of_days,sum=0,count=0;
        double average;
        System.out.print("How Many days of temprature you want to record  ");
        no_of_days = sc.nextInt();
        int arr[] = new int[no_of_days];
        
        // Input taking part

        for(int i=0;i<no_of_days;i++)
        {
            System.out.print("Enter the day " + (i+1) + " temp  ");
            arr[i] = sc.nextInt();
            sum += arr[i]; // Adding right after they are inserted
        }

        average = sum/no_of_days; // calculating average which is taken in dooble
        System.out.println("Average Temparature is " + average);

        //Comparing the elements to check for the above average tempratures
        for(int j=0;j<no_of_days;j++)
        {
            if(arr[j]>average)
            {
                count++;
            }
        }
        System.out.println("No of Days above than the average are: " + count);
    }

}
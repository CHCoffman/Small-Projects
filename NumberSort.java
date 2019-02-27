/*----------------------------------------------------------------*
 * Created by Colten Coffman 11/23/2018							  *
 * This program will take user input into an array and sort it	  *
 * into highest, lowest and average.							  *
 * COSC 1337.WW1 												  *
 *----------------------------------------------------------------*/
import java.util.Scanner;

public class NumberSort {

    public static void printNum(double[] numArray)
    {
    	for(int i = 0; i < numArray.length; i++)
    	{
    		System.out.print(numArray[i] + " ");
    	}
    }

    public static void sortNum(double[] numArray)
    {
    	double var = 0;
    	for(int i = 0; i < numArray.length; i++)
    	{
    		for(int x = i + 1; x < numArray.length; x++)
    		{
    			if(numArray[i] > numArray[x])
    			{
    				var = numArray[i];
    				numArray[i] = numArray[x];
    				numArray[x] = var;
    			}
    		}
    	}
    }

    public static double highestNumber(double[] numArray)
    {
    	double maxNumber = numArray[0];
    	for(int i = 1; i < numArray.length; i++)
    	{
    		if(numArray[i] > maxNumber)
    		{
    			maxNumber = numArray[i];
    		}
    	}
    	return maxNumber;
    }

    public static double lowestNumber(double[]numArray)
    {
    	double minNumber = numArray[0];
    	for(int i = 1; i < numArray.length; i++)
    	{
    		if(numArray[i] < minNumber)
    		{
    			minNumber = numArray[i];
    		}
    	}
    	return minNumber;
    }

    public static double averageNumber(double[] numArray)
    {
    	double averageNumber = 0;
    	for(int i = 0; i < numArray.length; i++)
    	{
    		averageNumber += numArray[i];
    	}
    	return (averageNumber / numArray.length);
    }

    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	int numOfNumbers;
    	System.out.print("Enter the total number of integers to "
    		+ "be entered into the array: " );
    	numOfNumbers = sc.nextInt();

    	double numArray[] = new double[numOfNumbers];
    	System.out.println("Enter the " + numOfNumbers + " numbers: ");
    	for(int i = 0; i < numArray.length; i++)
    	{
    		numArray[i] = sc.nextDouble();
    	}
    	System.out.print("************************************************");
		System.out.print("\nYou have entered: ");
    	printNum(numArray);
    	System.out.println("");
    	sortNum(numArray);
    	System.out.println("Highest Number: " + highestNumber(numArray));
    	System.out.println("Lowest Number: " + lowestNumber(numArray));
    	System.out.println("Average Number: " + averageNumber(numArray));
    	System.out.print("************************************************");

    }
}

/* @author Colten Coffman
 * 9/7/2018 
 * Program uses Euler's sieve algorithm to list all prime numbers to an upper bound
 */
package primeNumbers;
import java.util.Scanner;

public class Prime 
{
	public static void main(String[]args) throws FileNotFoundException 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upper bound: ");
		int N  = sc.nextInt();

		System.out.println("The prime numbers are: ");
		System.out.println("Less than/Equal to " + N);
		
		Prime x = new Prime();
		
		boolean prime[] = new boolean[N+1];
		for(int i=0;i<N;i++)
			prime[i] = true;
		
		for(int t = 2;t * t <= N; t++) 
		{
			if(prime[t] == true) 
			{
				for(int i = t*2; i <=N; i +=t)
					prime[i] = false;
			}
		}
		for(int i = 2; i<=N; i++)
		{
			if(prime[i]==true)
			System.out.println(i + "");
		}
	}
}

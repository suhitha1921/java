import java.io.*;
import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		int number, i = 1, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		while(i <= number)
		{
			sum = sum + i; 
			i++;
		}	
		
		System.out.println("\n The Sum of Natural Numbers from 1 to "+ number + " = " + sum);
	}
}
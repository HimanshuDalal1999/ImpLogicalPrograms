package Logical_Programs;

//import java.util.Scanner;

public class E_Factorial_Number_05
{
	public static void main(String[]args)
	{
//		System.out.println(" Enter Number : ");
//		Scanner S = new Scanner(System.in);
//		int NUM = S.nextInt();
		int NUM = 10;
		int Factorial = 1;
		
		for(int i=NUM; i>=1; i--)
		{
			Factorial = Factorial*i;
		}
		
		System.out.println("Factorial of "+NUM+" is : "+Factorial);	
		
	}



}
